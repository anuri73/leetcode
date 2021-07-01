package scala

import org.scalatest.funsuite.AnyFunSuite

class Solution8Test extends AnyFunSuite {
    test("Test1") {
        assert(Solution8.myAtoi("42") === 42)
    }

    test("Test2") {
        assert(Solution8.myAtoi("   -42") === -42)
    }

    test("Test3") {
        assert(Solution8.myAtoi("4193 with words") === 4193)
    }

    test("Test4") {
        assert(Solution8.myAtoi("words and 987") === 0)
    }

    test("Test5") {
        assert(Solution8.myAtoi("-91283472332") === -2147483648)
    }
}
