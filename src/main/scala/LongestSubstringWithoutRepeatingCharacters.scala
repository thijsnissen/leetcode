object LongestSubstringWithoutRepeatingCharacters extends App:
	def mySolution(s: String): Int =
		s.foldLeft(List("")):
			case (acc, c) if acc.head.contains(c) => acc.head.drop(acc.head.indexOf(c) + 1) + c :: acc
			case (acc, c)                         => acc.updated(0, acc.head + c)
		.maxBy(_.length)
		.length
