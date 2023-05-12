object ClimbingStairs extends App:
	// fibonacci sequence
	def mySolution(n: Int): Int =
		@annotation.tailrec
		def go(n: Int, current: Int = 1, next: Int = 1): Int =
			if n <= 0 then current
			else go(n - 1, next, current + next)

		go(n)
