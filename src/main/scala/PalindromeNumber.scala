object PalindromeNumber extends App:
	def mySolution(x: Int): Boolean =
		x.toString.reverse == x.toString

	def theirSolution(x: Int): Boolean =
		@annotation.tailrec
		def go(in: Int, out: Int): Int =
			if in == 0 then out
			else go(in / 10, out * 10 + in % 10)

		x > 0 && x == go(x, out = 0)
