object Solution {

  def lengthOfLongestSubstring(s: String): Int = {
    import scala.math.max

    var answer = 0

    val charMap = collection.mutable.Map[Char, Int]()

    var i = 0

    for (j <- i until s.length) {
      if (charMap.contains(s(j)))
        i = max(charMap(s(j)), i)

      answer = max(answer, j - i + 1)

      charMap(s(j)) = j + 1

    }

    answer
  }

}
