object arrelement extends App {

  abstract class Element {
    def demo() = {
      println("Element's implementation invoked")
    }
    def contents: Array[String]
    val height = contents.length
    val width =
      if (height == 0) 0 else contents(0).length
  }

  class ArrayElement(val contents: Array[String]) extends Element {
    override def demo(): Unit = {println("ArrayElement's implementation invoked")}

  }

//  val ae = new ArrayElement(Array("hello",
//    "world", "keks"))
//  println(ae.width, ae.height)

  class Cat {
    val dangerous = false
  }

  class Tiger (override val dangerous: Boolean,
               private var age: Int) extends Cat

  class LineElement(s: String) extends ArrayElement(Array(s)) {
    override def demo() = {
      println("ArrayElement's implementation invoked")
    }
//    override def width = s.length
//    override val height: Int = 1
  }

  class Uniformelement(ch: Char,
                       override val width: Int,
                       override val height: Int
                      ) extends Element {
    private val line = ch.toString * width
    def contents = Array.fill(height)(line)
  }

  val e1: Element = new ArrayElement(Array("hello", "world"))
  val ae: ArrayElement = new LineElement("hello")
  val e2: Element = ae
  val e3: Element = new Uniformelement('x',2, 3)


}
