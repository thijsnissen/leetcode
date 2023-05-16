import org.scalatest.funsuite.AnyFunSuite

class Test extends AnyFunSuite:
	test("1. Two Sum"):
		assertResult(expected = Array(1, 0))(actual = TwoSum.mySolution(Array(2, 7, 11, 15), 9))
		assertResult(expected = Array(2, 1))(actual = TwoSum.mySolution(Array(3, 2, 4), 6))
		assertResult(expected = Array(0, 1))(actual = TwoSum.mySolution(Array(3, 3), 6))

		assertResult(expected = Array(0, 1))(actual = TwoSum.theirSolution(Array(2, 7, 11, 15), 9))
		assertResult(expected = Array(1, 2))(actual = TwoSum.theirSolution(Array(3, 2, 4), 6))
		assertResult(expected = Array(0, 1))(actual = TwoSum.theirSolution(Array(3, 3), 6))

		assertResult(expected = Array(0, 1))(actual = TwoSum.theirSolution2(Array(2, 7, 11, 15), 9))
		assertResult(expected = Array(1, 2))(actual = TwoSum.theirSolution2(Array(3, 2, 4), 6))
		assertResult(expected = Array(0, 1))(actual = TwoSum.theirSolution2(Array(3, 3), 6))

	test("2. Add Two Numbers"):
		assertResult(expected = List(7,0,8))(actual = AddTwoNumbers.mySolution(List(2, 4, 3), List(5, 6, 4)))
		assertResult(expected = List(0))(actual = AddTwoNumbers.mySolution(List(0), List(0)))
		assertResult(expected = List(8, 9, 9, 9, 0, 0, 0, 1))(actual = AddTwoNumbers.mySolution(List(9, 9, 9, 9, 9, 9, 9), List(9, 9, 9, 9)))

		assertResult(expected = List(7,0,8))(actual = AddTwoNumbers.mySolution2(List(2, 4, 3), List(5, 6, 4)))
		assertResult(expected = List(0))(actual = AddTwoNumbers.mySolution2(List(0), List(0)))
		assertResult(expected = List(8, 9, 9, 9, 0, 0, 0, 1))(actual = AddTwoNumbers.mySolution2(List(9, 9, 9, 9, 9, 9, 9), List(9, 9, 9, 9)))

		assertResult(expected = List(7, 0, 8))(actual = AddTwoNumbers.mySolution3(List(2, 4, 3), List(5, 6, 4)))
		assertResult(expected = List(0))(actual = AddTwoNumbers.mySolution3(List(0), List(0)))
		assertResult(expected = List(8, 9, 9, 9, 0, 0, 0, 1))(actual = AddTwoNumbers.mySolution3(List(9, 9, 9, 9, 9, 9, 9), List(9, 9, 9, 9)))

	test("3. LongestSubstringWithoutRepeatingCharacters"):
		assertResult(expected = 3)(LongestSubstringWithoutRepeatingCharacters.mySolution("abcabcbb"))
		assertResult(expected = 1)(LongestSubstringWithoutRepeatingCharacters.mySolution("bbbbb"))
		assertResult(expected = 3)(LongestSubstringWithoutRepeatingCharacters.mySolution("pwwkew"))

	test("9. Palindrome Number"):
		assertResult(expected = true)(actual = PalindromeNumber.mySolution(121))
		assertResult(expected = false)(actual = PalindromeNumber.mySolution(-121))
		assertResult(expected = false)(actual = PalindromeNumber.mySolution(10))

		assertResult(expected = true)(actual = PalindromeNumber.theirSolution(121))
		assertResult(expected = false)(actual = PalindromeNumber.theirSolution(-121))
		assertResult(expected = false)(actual = PalindromeNumber.theirSolution(10))

	test("13. Roman To Integer"):
		assertResult(3)(RomanToInteger.mySolution("III"))
		assertResult(58)(RomanToInteger.mySolution("LVIII"))
		assertResult(1994)(RomanToInteger.mySolution("MCMXCIV"))

		assertResult(3)(RomanToInteger.theirSolution("III"))
		assertResult(58)(RomanToInteger.theirSolution("LVIII"))
		assertResult(1994)(RomanToInteger.theirSolution("MCMXCIV"))

	test("20. Valid Parentheses"):
		assertResult(true)(ValidParentheses.mySolution("()"))
		assertResult(true)(ValidParentheses.mySolution("(also)[with]{content}"))
		assertResult(true)(ValidParentheses.mySolution("([{}])"))
		assertResult(false)(ValidParentheses.mySolution("(]"))
		assertResult(false)(ValidParentheses.mySolution("([{]})"))
		assertResult(false)(ValidParentheses.mySolution("]"))

	test("35. Search Insert Position"):
		assertResult(2)(SearchInsertPosition.mySolution2(Array(1, 3, 5, 6), 5))
		assertResult(1)(SearchInsertPosition.mySolution2(Array(1, 3, 5, 6), 2))
		assertResult(4)(SearchInsertPosition.mySolution2(Array(1, 3, 5, 6), 7))
		assertResult(0)(SearchInsertPosition.mySolution2(Array(1, 3, 5, 6), 0))
		assertResult(0)(SearchInsertPosition.mySolution2(Array(1), 0))
		assertResult(0)(SearchInsertPosition.mySolution2(Array(1), 1))

	ignore("62. Unique Paths"):
		assertResult(28)(UniquePaths.theirSolution(7, 3))
		assertResult(3)(UniquePaths.theirSolution(2, 3))
		assertResult(193536720)(UniquePaths.mySolution(23, 12))

	test("70. Climbing Stairs"):
		assertResult(2)(ClimbingStairs.mySolution(2))
		assertResult(3)(ClimbingStairs.mySolution(3))
		assertResult(8)(ClimbingStairs.mySolution(5))
