object AddTwoNumbers extends App:
	def mySolution(l1: List[Int], l2: List[Int]): List[Int] =
		(l1.reverse.mkString("").toInt + l2.reverse.mkString("").toInt)
			.toString
			.reverse
			.map(_.toInt - 48)
			.toList

	def mySolution2(l1: List[Int], l2: List[Int]): List[Int] =
		@annotation.tailrec
		def go(i: Int = 0, remainder: Int = 0, acc: List[Int] = List.empty[Int]): List[Int] =
			if i >= math.max(l1.size, l2.size) && remainder == 0 then
				acc
			else
				val n = l1.lift(i).getOrElse(0) + l2.lift(i).getOrElse(0) + remainder

				go(i + 1, n / 10, acc :+ n % 10)

		go()

	def mySolution3(l1: List[Int], l2: List[Int]): List[Int] =
		@annotation.tailrec
		def go(ls1: List[Int], ls2: List[Int], remainder: Int = 0, acc: List[Int] = List.empty[Int]): List[Int] =
			if ls1 == Nil && ls2 == Nil && remainder == 0 then
				acc
			else
				val n = ls1.headOption.getOrElse(0) + ls2.headOption.getOrElse(0) + remainder

				go(ls1.drop(1), ls2.drop(1), n / 10, acc :+ n % 10)

		go(l1, l2)
