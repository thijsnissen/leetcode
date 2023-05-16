object SearchInsertPosition extends App:
	def mySolution(nums: Array[Int], target: Int): Int =
		nums
			.sorted
			.zipWithIndex
			.find((n, _) => n >= target)
			.getOrElse((target, nums.length))
			._2

	def mySolution2(nums: Array[Int], target: Int): Int =
		val result = nums.indexWhere(_ >= target)

		if result < 0 then nums.length else result

	def adaptedMarcosSolution(nums: Array[Int], target: Int): Int =
		@annotation.tailrec
		def go(find: Array[Int], idx: Int = 0): Int =
			if find.isEmpty then nums.length
			else if find.head >= target then idx
			else go(find.tail, idx + 1)

		go(nums)
