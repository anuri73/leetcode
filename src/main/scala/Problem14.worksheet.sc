object Solution {
  def longestCommonPrefix(strs: Array[String]): String = {
    var i = 0;
    while (strs.forall(s => i < s.size && s(i) == strs.head(i))) i += 1
    strs.head.take(i)
  }
}

Solution.longestCommonPrefix(Array("flower", "flow", "flight"))
Solution.longestCommonPrefix(Array("flow", "flower", "flowe"))
Solution.longestCommonPrefix(Array("dog", "racecar", "car"))
Solution.longestCommonPrefix(Array(""))
Solution.longestCommonPrefix(Array("", "Hello"))
Solution.longestCommonPrefix(Array("Hello", ""))
