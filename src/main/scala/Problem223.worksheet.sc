object Solution {
  def computeArea(
      ax1: Int,
      ay1: Int,
      ax2: Int,
      ay2: Int,
      bx1: Int,
      by1: Int,
      bx2: Int,
      by2: Int
  ): Int = {
    val cx1 = if (ax1 > bx1) ax1 else bx1
    val cx2 = if (ax2 < bx2) ax2 else bx2
    val cy1 = if (ay1 > by1) ay1 else by1
    val cy2 = if (ay2 < by2) ay2 else by2
    val c = if (bx1 > ax2 || by1 > ay2 || by2 < ay1 || bx2 < ax1) {
      0
    } else {
      ((cx1 - cx2) * (cy1 - cy2))
    }
    val a = ((ax1 - ax2) * (ay1 - ay2)).abs
    val b = ((bx1 - bx2) * (by1 - by2)).abs
    a + b - c
  }
}

Solution.computeArea(
  ax1 = -3,
  ay1 = 0,
  ax2 = 3,
  ay2 = 4,
  bx1 = 0,
  by1 = -1,
  bx2 = 9,
  by2 = 2
)

Solution.computeArea(
  ax1 = -2,
  ay1 = -2,
  ax2 = 2,
  ay2 = 2,
  bx1 = -2,
  by1 = -2,
  bx2 = 2,
  by2 = 2
)

Solution.computeArea(
  ax1 = -2,
  ay1 = -2,
  ax2 = 2,
  ay2 = 2,
  bx1 = 3,
  by1 = 3,
  bx2 = 4,
  by2 = 4
)

Solution.computeArea(
  ax1 = -2,
  ay1 = -2,
  ax2 = 2,
  ay2 = 2,
  bx1 = -4,
  by1 = -4,
  bx2 = -3,
  by2 = -3
)
