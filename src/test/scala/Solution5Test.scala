import org.scalatest.funsuite.AnyFunSuite

class Solution5Test extends AnyFunSuite {
  test("Test1") {
    assert(List[String]("bab", "aba").contains(Solution5.longestPalindrome("babad")))
  }
  test("Test2") {
    assert("bb" === Solution5.longestPalindrome("cbbd"))
  }
  test("Test3") {
    assert("a" === Solution5.longestPalindrome("a"))
  }
  test("Test4") {
    assert(List[String]("a", "c").contains(Solution5.longestPalindrome("ac")))
  }
  test("Test5") {
    assert("bb" === Solution5.longestPalindrome("abb"))
  }
}
