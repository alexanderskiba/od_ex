
import scala.collection.mutable.ArrayBuffer

class BasicIntQueue extends IntQueue {
  val buf = new ArrayBuffer[Int]
  def get() = buf.remove(0)
  def put(x: Int) = { buf += x }
}
