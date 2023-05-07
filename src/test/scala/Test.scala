import org.scalatest.funsuite.AnyFunSuite

class Test extends AnyFunSuite:
	test("TwoSum"):
		assertResult(expected = Array(1, 0))(actual = TwoSum.mySolution(Array(2, 7, 11, 15), 9))
		assertResult(expected = Array(2, 1))(actual = TwoSum.mySolution(Array(3, 2, 4), 6))
		assertResult(expected = Array(0, 1))(actual = TwoSum.mySolution(Array(3, 3), 6))

		assertResult(expected = Array(0, 1))(actual = TwoSum.theirSolution(Array(2, 7, 11, 15), 9))
		assertResult(expected = Array(1, 2))(actual = TwoSum.theirSolution(Array(3, 2, 4), 6))
		assertResult(expected = Array(0, 1))(actual = TwoSum.theirSolution(Array(3, 3), 6))

		assertResult(expected = Array(0, 1))(actual = TwoSum.theirSolution2(Array(2, 7, 11, 15), 9))
		assertResult(expected = Array(1, 2))(actual = TwoSum.theirSolution2(Array(3, 2, 4), 6))
		assertResult(expected = Array(0, 1))(actual = TwoSum.theirSolution2(Array(3, 3), 6))

	test("PalindromeNumber"):
		assertResult(expected = true)(actual = PalindromeNumber.mySolution(121))
		assertResult(expected = false)(actual = PalindromeNumber.mySolution(-121))
		assertResult(expected = false)(actual = PalindromeNumber.mySolution(10))

		assertResult(expected = true)(actual = PalindromeNumber.theirSolution(121))
		assertResult(expected = false)(actual = PalindromeNumber.theirSolution(-121))
		assertResult(expected = false)(actual = PalindromeNumber.theirSolution(10))

	test("AddTwoNumbers"):
		assertResult(expected = List(7,0,8))(actual = AddTwoNumbers.mySolution(List(2, 4, 3), List(5, 6, 4)))
		assertResult(expected = List(0))(actual = AddTwoNumbers.mySolution(List(0), List(0)))
		assertResult(expected = List(8, 9, 9, 9, 0, 0, 0, 1))(actual = AddTwoNumbers.mySolution(List(9, 9, 9, 9, 9, 9, 9), List(9, 9, 9, 9)))

		assertResult(expected = List(7,0,8))(actual = AddTwoNumbers.mySolution2(List(2, 4, 3), List(5, 6, 4)))
		assertResult(expected = List(0))(actual = AddTwoNumbers.mySolution2(List(0), List(0)))
		assertResult(expected = List(8, 9, 9, 9, 0, 0, 0, 1))(actual = AddTwoNumbers.mySolution2(List(9, 9, 9, 9, 9, 9, 9), List(9, 9, 9, 9)))

		assertResult(expected = List(7, 0, 8))(actual = AddTwoNumbers.mySolution3(List(2, 4, 3), List(5, 6, 4)))
		assertResult(expected = List(0))(actual = AddTwoNumbers.mySolution3(List(0), List(0)))
		assertResult(expected = List(8, 9, 9, 9, 0, 0, 0, 1))(actual = AddTwoNumbers.mySolution3(List(9, 9, 9, 9, 9, 9, 9), List(9, 9, 9, 9)))
