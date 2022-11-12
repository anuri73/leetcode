import scala.math.{max, min}

object Solution {
  def findMedianSortedArrays(A: Array[Int], B: Array[Int]): Double = {
    if (A.length > B.length) {
      this.process(B, A)
    } else {
      this.process(A, B)
    }
  }

  private def process(A: Array[Int], B: Array[Int]): Double = {
    val aLength: Int = A.length
    val bLength: Int = B.length

    val leftHalfLen: Int = (aLength + (bLength + 1)) / 2

    var aMinCount = 0
    var aMaxCount = aLength
    while (aMinCount <= aMaxCount) {
      val aCount = aMinCount + (aMaxCount - aMinCount) / 2
      val bCount = leftHalfLen - aCount

      if ((aCount > 0) && (A(aCount - 1) > B(bCount)))
        aMaxCount = aCount - 1
      else if ((aCount < aLength) && (B(bCount - 1) > A(aCount)))
        aMinCount = aCount + 1
      else {
        val leftHalfEnd =
          if (0 == aCount)
            B(bCount - 1)
          else if (0 == bCount)
            A(aCount - 1)
          else
            max(A(aCount - 1), B(bCount - 1))

        if (isOdd(aLength + bLength))
          return leftHalfEnd

        val rightHalfStart =
          if (aCount == aLength)
            B(bCount)
          else if (bCount == bLength)
            A(aCount)
          else
            min(A(aCount), B(bCount))

        return (leftHalfEnd + rightHalfStart) / 2.0
      }
    }
    0.0
  }

  private def isOdd(x: Int): Boolean = 1 == (x & 1)
}
