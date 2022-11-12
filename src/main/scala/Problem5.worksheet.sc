object Solution {

  def isPalindrome(str: String): Boolean = str.reverse.mkString == str

  def longestPalindrome(s: String): String = {

    for (length <- s.length to 0 by -1) {
      for (begin <- 0 to s.length - length) {
        val end = begin + length
        if (end <= s.length && isPalindrome(s.substring(begin, end)))
          return s.substring(begin, end)
      }
    }
    s
  }
}