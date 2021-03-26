object Solution1 {
  def twoSum(numbers: Array[Int], target: Int): Array[Int] = {
    val dict = scala.collection.mutable.Map[Int, Int]()
    (for {
      pair@(x, i) <- numbers.zipWithIndex
      if dict.contains(target - x) || {
        dict += pair; false
      }
      j <- dict.get(target - x)
    } yield Array(j, i)).flatten
  }
}
