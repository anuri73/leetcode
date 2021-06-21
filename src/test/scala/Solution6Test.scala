package scala

import org.scalatest.funsuite.AnyFunSuite

class Solution6Test extends AnyFunSuite {
    test("Test1") {
        assert(Solution6.convert("PAYPALISHIRING", 3) === "PAHNAPLSIIGYIR")
    }

    test("Test2") {
        assert(Solution6.convert("PAYPALISHIRING", 4) === "PINALSIGYAHRPI")
    }

    test("Test3") {
        assert(Solution6.convert("A", 1) === "A")
    }
    test("Test4") {
        assert(Solution6.convert("AB", 1) === "AB")
    }
}
