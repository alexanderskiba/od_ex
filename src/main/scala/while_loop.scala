import scala.io.StdIn.readLine
object while_loop extends App {

  def gcdLoop(x: Long, y: Long): Long = {
    var a = x
    var b = y
    while( a!= 0) {
      val temp = a
      a = b % a
      b = temp
    }
    b
  }
  // ниже альтернативный способ определения наибольшего общего заменателя в функциональном стиле
  def gcd(x: Long, y: Long): Long =
    if(y == 0) x else gcd(y, x % y)

  // do-while цикл
  var line = ""
  do {
    line = readLine()
    println("Read" + line)
  } while (line!="")

}
