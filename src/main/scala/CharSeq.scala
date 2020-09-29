object CharSeq extends App {

  trait CharSequence {
    def charAt(index: Int): Char
    def length: Int
    def subSequence(start: Int, end: Int): CharSequence
    def toString(): String
  }

  class Point (val x: Int, val y: Int)

//  class Rectangle(val topLeft: Point, val bottomRight: Point) {
//    def left = topLeft.x
//    def right = bottomRight.x
//    def width = right - left
//    // etc
//  }

//  abstract class Component {
//    def topLeft: Point
//    def bottomRight: Point
//
//    def left = topLeft.x
//    def right = bottomRight.x
//    def width = right - left
//  }

  trait Rectangular {
    def topLeft: Point
    def bottomRight: Point

    def left = topLeft.x
    def right = bottomRight.x
    def width = right - left
  }

  class Rectangle(val topLeft: Point, val bottomRight: Point) extends Rectangular {
    //
  }
  val rect = new Rectangle(new Point(1, 1), new Point(10, 10))
  println(rect.left, rect.right, rect.width)
}
