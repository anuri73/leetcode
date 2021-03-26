import Solution2.ListNode
import org.scalatest.funsuite.AnyFunSuite

class Solution2Test extends AnyFunSuite {
  test("Test 1") {
    val result = Solution2.addTwoNumbers(
      new ListNode(2, new ListNode(4, new ListNode(3))),
      new ListNode(5, new ListNode(6, new ListNode(4)))
    )
    assert(
      new ListNode(7, new ListNode(0, new ListNode(8))).equals(result)
    )
  }

  test("Test 2") {
    val result = Solution2.addTwoNumbers(
      new ListNode(0),
      new ListNode(0)
    )
    assert(
      new ListNode(0).equals(result)
    )
  }

  test("Test 3") {
    val result = Solution2.addTwoNumbers(
      new ListNode(9, new ListNode(9, new ListNode(9, new ListNode(9, new ListNode(9, new ListNode(9, new ListNode(9))))))),
      new ListNode(9, new ListNode(9, new ListNode(9, new ListNode(9))))
    )
    assert(
      result.equals(
        new ListNode(8, new ListNode(9, new ListNode(9, new ListNode(9, new ListNode(0, new ListNode(0, new ListNode(0, new ListNode(1))))))))
      )
    )
  }
}