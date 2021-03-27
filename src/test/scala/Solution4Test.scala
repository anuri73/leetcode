import org.scalatest.funsuite.AnyFunSuite

class Solution4Test extends AnyFunSuite {
  test("Test1") {
    assert(2 === Solution4.findMedianSortedArrays(Array(1, 3), Array(2)))
  }
  test("Test2") {
    assert(2.5 === Solution4.findMedianSortedArrays(Array(1, 2), Array(3, 4)))
  }
  test("Test3") {
    assert(0 === Solution4.findMedianSortedArrays(Array(0, 0), Array(0, 0)))
  }
  test("Test4") {
    assert(1 === Solution4.findMedianSortedArrays(Array(), Array(1)))
  }
  test("Test5") {
    assert(2 === Solution4.findMedianSortedArrays(Array(2), Array()))
  }
  test("Test6") {
    assert(2.5 === Solution4.findMedianSortedArrays(Array(1, 3), Array(2, 7)))
  }
}
