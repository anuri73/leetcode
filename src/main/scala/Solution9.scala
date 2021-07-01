package scala

object Solution9 {
    def isPalindrome(x: Int): Boolean = {
        val s = x.toString
        s.reverse.mkString == s
    }
}
