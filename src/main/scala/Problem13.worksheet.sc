object Solution {
  def romanToInt(s: String): Int = {
    @scala.annotation.tailrec
    def go(w: List[Char], sum: Int = 0): Int = {
      w.toList match {
        case 'I' :: 'V' :: tail => go(tail, 4 + sum)
        case 'I' :: 'X' :: tail => go(tail, 9 + sum)
        case 'X' :: 'L' :: tail => go(tail, 40 + sum)
        case 'X' :: 'C' :: tail => go(tail, 90 + sum)
        case 'C' :: 'D' :: tail => go(tail, 400 + sum)
        case 'C' :: 'M' :: tail => go(tail, 900 + sum)
        case 'I' :: tail        => go(tail, 1 + sum)
        case 'V' :: tail        => go(tail, 5 + sum)
        case 'X' :: tail        => go(tail, 10 + sum)
        case 'L' :: tail        => go(tail, 50 + sum)
        case 'C' :: tail        => go(tail, 100 + sum)
        case 'D' :: tail        => go(tail, 500 + sum)
        case 'M' :: tail        => go(tail, 1000 + sum)
        case _                  => sum
      }
    }
    go(s.toList)
  }
}

Solution.romanToInt("IV")
Solution.romanToInt("III")
Solution.romanToInt("LVIII")
Solution.romanToInt("MCMXCIV")
