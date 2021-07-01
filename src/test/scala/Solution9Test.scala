package scala

import org.scalatest.funsuite.AnyFunSuite

class Solution9Test extends AnyFunSuite {
    test("Test1") {
        assert(Solution9.isPalindrome(121) === true)
    }

    test("Test2") {
        assert(Solution9.isPalindrome(-121) === false)
    }

    test("Test3") {
        assert(Solution9.isPalindrome(10) === false)
    }

    test("Test4") {
        assert(Solution9.isPalindrome(-101) === false)
    }

    test("Test5") {
        assert(Solution9.isPalindrome(121) === true)
    }

    test("Test6") {
        assert(Solution9.isPalindrome(1) === true)
    }
}
