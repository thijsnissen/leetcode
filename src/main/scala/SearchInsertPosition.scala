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
