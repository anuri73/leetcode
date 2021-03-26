import org.scalatest.funsuite.AnyFunSuite

class Solution1Test extends AnyFunSuite {
  test("Test1") {
    assert(Array(0, 1) === Solution1.twoSum(Array(2, 7, 11, 15), 9))
  }

  test("Test2") {
    assert(Array(1, 2) === Solution1.twoSum(Array(3, 2, 4), 6))
  }

  test("Test3") {
    assert(Array(0, 1) === Solution1.twoSum(Array(3, 3), 6))
  }
}