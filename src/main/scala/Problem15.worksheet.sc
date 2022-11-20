object Solution {
  def threeSum(nums: Array[Int]): List[List[Int]] = {
    var result = Set[List[Int]]()
    val sortedNums = nums.sorted
    var a = 0
    while (a < sortedNums.size - 2) {
      var b = a + 1
      var c = sortedNums.size - 1

      while (b < c) {
        if (0 > sortedNums(a) + sortedNums(b) + sortedNums(c))
          b += 1
        else if (0 < sortedNums(a) + sortedNums(b) + sortedNums(c))
          c -= 1
        else {
          result += List(sortedNums(a), sortedNums(b), sortedNums(c))
          b += 1
          while (sortedNums(b) == sortedNums(b - 1) && b < c)
            b += 1
        }
      }

      a += 1
      while (sortedNums(a - 1) == sortedNums(a) && a < sortedNums.size - 1)
        a += 1
    }
    result.toList
  }
}

val nums = Array(-1, 0, 1, 2, -1, -4)
// -4, -1, -1, 0, 1, 2

Solution.threeSum(nums)
Solution.threeSum(Array(0, 1, 1))
Solution.threeSum(Array(0, 0, 0))
Solution.threeSum(Array(0, 0, 0, 0, 0, 0))
