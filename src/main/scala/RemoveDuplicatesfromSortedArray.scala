object RemoveDuplicatesfromSortedArray extends App:
	def mySolution(nums: Array[Int]): Int =
		nums
			.distinct
			.zipWithIndex
			.map((n, i) => nums(i) = n)
			.length
