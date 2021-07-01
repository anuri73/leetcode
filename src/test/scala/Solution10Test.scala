package scala

import org.scalatest.funsuite.AnyFunSuite

class Solution10Test extends AnyFunSuite {
    test("Test1") {
        assert(Solution10.isMatch("aa", "a") === false)
    }

    test("Test2") {
        assert(Solution10.isMatch("aa", "a*") === true)
    }

    test("Test3") {
        assert(Solution10.isMatch("ab", ".*") === true)
    }

    test("Test4") {
        assert(Solution10.isMatch("aab", "c*a*b") === true)
    }

    test("Test5") {
        assert(Solution10.isMatch("mississippi", "mis*is*p*.") === false)
    }
}
