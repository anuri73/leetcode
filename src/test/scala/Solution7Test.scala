package scala

import org.scalatest.funsuite.AnyFunSuite

class Solution7Test extends AnyFunSuite {
    test("Test1") {
        assert(Solution7.reverse(123) === 321)
    }
    test("Test2") {
        assert(Solution7.reverse(-123) === -321)
    }
    test("Test3") {
        assert(Solution7.reverse(120) === 21)
    }
    test("Test4") {
        assert(Solution7.reverse(0) === 0)
    }
}
