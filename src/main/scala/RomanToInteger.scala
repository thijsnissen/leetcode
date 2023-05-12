object RomanToInteger extends App:
	def mySolution(s: String): Int =
		s.reverse.foldLeft(List[(String, Int)]("" -> 0)):
			case (acc, 'I') if acc.head._1 == "V" => "IV" -> 4   :: acc.tail
			case (acc, 'I') if acc.head._1 == "X" => "IX" -> 9   :: acc.tail
			case (acc, 'X') if acc.head._1 == "L" => "XL" -> 40  :: acc.tail
			case (acc, 'X') if acc.head._1 == "C" => "XC" -> 90  :: acc.tail
			case (acc, 'C') if acc.head._1 == "D" => "IV" -> 4   :: acc.tail
			case (acc, 'C') if acc.head._1 == "M" => "IV" -> 4   :: acc.tail
			case (acc, 'I')                       => "I"  -> 1   :: acc
			case (acc, 'V')                       => "V"  -> 5   :: acc
			case (acc, 'X')                       => "X"  -> 10  :: acc
			case (acc, 'L')                       => "L"  -> 50  :: acc
			case (acc, 'C')                       => "C"  -> 100 :: acc
			case (acc, 'D')                       => "CD" -> 400 :: acc
			case (acc, 'M')                       => "CM" -> 900 :: acc
			case (acc, _)                         =>                acc
		.map(_._2)
		.sum

	def theirSolution(s: String): Int =
		def parse(c: Char): Int =
			c match
				case 'I' => 1
				case 'V' => 5
				case 'X' => 10
				case 'L' => 50
				case 'C' => 100
				case 'D' => 500
				case 'M' => 1000

		s.collect(parse).foldLeft(List[Int](0)):
			case (acc, n) if n > acc.head => (n - acc.head) :: acc.tail
			case (acc, n)                 => n :: acc
		.sum
