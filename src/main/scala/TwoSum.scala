object TwoSum extends App:
	def mySolution(nums: Array[Int], target: Int): Array[Int] =
		nums
			.zipWithIndex
			.map((n, i) => Array(nums.indexWhere(_ + n == target), i))
			.find(a => ! a.contains(-1) && a.distinct.length == 2)
			.getOrElse(sys.error("Not found!"))

	def theirSolution(nums: Array[Int], target: Int): Array[Int] =
		val n = nums.zipWithIndex.sortBy(_._1)

		@annotation.tailrec
		def go(l: Int, h: Int): Array[Int] =
			n(l)._1 + n(h)._1 match
				case t if t == target => Array(n(l)._2, n(h)._2)
				case t if t > target  => go(l, h - 1)
				case t if t < target  => go(l + 1, h)

		go(0, n.length - 1)

	def theirSolution2(nums: Array[Int], target: Int): Array[Int] =
		@annotation.tailrec
		def go(index: Int, seen: Map[Int, Int]): Array[Int] =
			seen.get(target - nums(index)) match
				case Some(i) => Array(i, index)
				case None    => go(index + 1, seen + (nums(index) -> index))

		go(index = 0, Map.empty[Int, Int])
