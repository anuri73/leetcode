object Solution {
  def reverseWords(s: String): String =
    s.split(" ").filterNot(_ == "").reverse.mkString(" ")
}

Solution.reverseWords("the sky is blue")
Solution.reverseWords("  hello world  ")
Solution.reverseWords("a good   example")
