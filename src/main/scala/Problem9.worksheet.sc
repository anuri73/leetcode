object Solution {
    def isPalindrome(x: Int): Boolean = {
        val s = x.toString
        s.reverse.mkString == s
    }
}
