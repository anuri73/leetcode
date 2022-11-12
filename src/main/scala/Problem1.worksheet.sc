object Solution1 {
  def twoSum(nums: Array[Int], target: Int): Array[Int] = {
    @scala.annotation.tailrec
    def loop(i: Int, j: Int): Array[Int] = {
      if (nums(i) + nums(j) == target) {
        return Array(i, j)
      } else if (j + 1 == nums.size) {
        loop(i + 1, i + 1)
      } else {
        loop(i, j + 1)
      }
    }

    loop(0, 1)
  }
}

Solution1.twoSum(Array(1, 2, 3, 4, 5, 6, 7, 8, 9), 18)

object Solution2 {
  def twoSum(nums: Array[Int], target: Int): Array[Int] = {
      val dict = scala.collection.mutable.Map[Int, Int]()
      (for {
        pair @ (x, i) <- nums.zipWithIndex
        if dict.contains(target - x) || {dict += pair; false}
        j <- dict.get(target-x)
      } yield Array(j,i)).flatten
    }
}

Solution2.twoSum(Array(1, 2, 3, 4, 5, 6, 7, 8, 9), 17)
