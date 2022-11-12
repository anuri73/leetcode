object Solution {

  class ListNode(_x: Int = 0, _next: ListNode = null) {
    var x: Int = _x
    var next: ListNode = _next

    def equals(that: ListNode): Boolean =
      that match {
        case that: ListNode => that.next match {
          case null => this.x == that.x
          case _ => this.next.equals(that.next)
        }
        case _ => false
      }
  }

  def addTwoNumbers(l1: ListNode, l2: ListNode): ListNode = {
    def add(l1: ListNode, l2: ListNode, carryDigit: Boolean): ListNode = {
      val sum: Int =
        (if (l1 == null) 0 else l1.x) +
          (if (l2 == null) 0 else l2.x) +
          (if (carryDigit) 1 else 0)

      val current: ListNode = new ListNode(sum % 10)

      if (
        (l1 != null && l1.next != null) ||
          (l2 != null && l2.next != null) ||
          sum >= 10
      ) {
        current.next = add(
          l1 = if (l1 != null) l1.next else null,
          l2 = if (l2 != null) l2.next else null,
          carryDigit = sum >= 10
        )
      }

      current
    }

    add(l1, l2, false)
  }
}
