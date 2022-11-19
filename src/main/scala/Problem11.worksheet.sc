import Math._
object Solution {
  def maxArea(height: Array[Int]): Int = {
    var left = 0
    var right = height.size - 1
    var square = 0
    while (left < right) {
      square = max(square, (right - left) * min(height(left), height(right)))
      if (height(left) < height(right)) left += 1
      else right -= 1
    }
    square
  }
}

Solution.maxArea(Array(1, 8, 6, 2, 5, 4, 8, 3, 7))
Solution.maxArea(Array(1, 1))
