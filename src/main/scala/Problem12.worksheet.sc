object Solution {
  def intToRoman(num: Int): String = {
    var t = num
    val result = new StringBuilder()
    while (t >= 1000) {
      t -= 1000
      result += 'M'
    }
    while (t >= 900) {
      t -= 900
      result += 'C'
      result += 'M'
    }
    while (t >= 500) {
      t -= 500
      result += 'D'
    }
    while (t >= 400) {
      t -= 400
      result += 'C'
      result += 'D'
    }
    while (t >= 100) {
      t -= 100
      result += 'C'
    }
    while (t >= 90) {
      t -= 90
      result += 'X'
      result += 'C'
    }
    while (t >= 50) {
      t -= 50
      result += 'L'
    }
    while (t >= 40) {
      t -= 40
      result += 'X'
      result += 'L'
    }
    while (t >= 10) {
      t -= 10
      result += 'X'
    }
    while (t >= 9) {
      t -= 9
      result += 'I'
      result += 'X'
    }
    while (t >= 5) {
      t -= 5
      result += 'V'
    }
    while (t >= 4) {
      t -= 4
      result += 'I'
      result += 'V'
    }
    while (t >= 1) {
      t -= 1
      result += 'I'
    }
    result.toString()
  }
}

Solution.intToRoman(3)
Solution.intToRoman(4)
Solution.intToRoman(58)
Solution.intToRoman(1994)
