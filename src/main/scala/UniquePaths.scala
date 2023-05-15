object UniquePaths extends App:
	// C(m+n,m): the number of subsets of length m of a set that has m+n elements)
	def mySolution(m: Int, n: Int): Int =
		(0 until (m - 1 + n - 1))
			.combinations(m - 1)
			.size

	// factorial
	def theirSolution(m: Int, n: Int): Int =
		@annotation.tailrec
		def go(n: Int, acc: Int = 1): Int =
			if n <= 0 then acc
			else go(n - 1, n * acc)

		go(m - 1 + n - 1) / (go(m - 1) * go(n - 1))

	// TODO: figure this thing out...
