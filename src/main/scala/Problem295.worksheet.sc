import scala.collection.mutable.PriorityQueue

class MedianFinder() {

  val left = PriorityQueue.empty[Int].reverse
  val right = PriorityQueue.empty[Int]

  def addNum(num: Int) = {
    right.enqueue(num)
    val t = right.dequeue()
    left.enqueue(t)
    if (left.size > right.size) {
      val lowestLeft = left.dequeue()
      right.enqueue(lowestLeft)
    }
  }

  def findMedian(): Double = {
    if (right.size > left.size) {
      right.head
    } else {
      (right.head + left.head) / 2.0
    }
  }

}

/** Your MedianFinder object will be instantiated and called as such: var obj =
  * new MedianFinder() obj.addNum(num) var param_2 = obj.findMedian()
  */

val medianFinder = new MedianFinder();
medianFinder.addNum(1); // arr = [1]
medianFinder.addNum(2); // arr = [1, 2]
medianFinder.findMedian(); // return 1.5 (i.e., (1 + 2) / 2)
medianFinder.addNum(3); // arr[1, 2, 3]
medianFinder.findMedian(); // return 2.0
