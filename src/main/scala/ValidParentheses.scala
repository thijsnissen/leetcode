object ValidParentheses extends App:
	def mySolution(s: String): Boolean =
		val braces: Map[Char, Char] = Map('{' -> '}', '[' -> ']', '(' -> ')')

		s.foldLeft(List.empty[Char]):
			case (acc, c) if acc.nonEmpty && braces.get(acc.head).contains(c) => acc.tail
			case (acc, c) if braces.exists((x, y) => x == c || y == c) => c :: acc
			case (acc, _) => acc
		.isEmpty
