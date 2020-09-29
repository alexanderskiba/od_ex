import scala.collection.mutable.ArrayBuffer


object Queue extends App {
  val queue = new BasicIntQueue
  queue.put(10)
  queue.put(20)
  queue.get()
//  println(queue.get())

//  class MyQueue extends BasicIntQueue with Doubling

  val queue1 = new BasicIntQueue with Doubling
  queue1.put(10)
  println(queue1.get())

  trait Incementing extends IntQueue {
    abstract override def put(x: Int): Unit = {super.put(x + 1)}
  }

  trait Filtering extends IntQueue {
    abstract override def put(x: Int): Unit = {if (x >=0) super.put(x)}
  }

  val quuu = (new BasicIntQueue with Incementing with Filtering)
  quuu.put(-1); quuu.put(0); quuu.put(1)
  println(quuu.get())
}
