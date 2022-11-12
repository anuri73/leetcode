import scala.util.matching.Regex

object Solution {
    val numRE: Regex = "\\s*([+-]?)0*(\\d+).*".r

    def myAtoi(s: String): Int = s match {
        case numRE(signStr, numStr) =>
            val sign = if (Option(signStr).contains("-")) -1 else 1
            val bailOut = if (sign < 0) Int.MinValue else Int.MaxValue
            if (numStr.length > 10) bailOut
            else if (numStr.length < 10 || numStr < "2147483648")
                sign * numStr.foldLeft(0)(_ * 10 + _.asDigit)
            else bailOut
        case _ => 0
    }
}
