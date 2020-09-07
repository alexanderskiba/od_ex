import scala.annotation.tailrec

object without_break extends App {
//  var i = 0
//  var foundInt = false
//
//  while (i < args.length && !foundInt) {
//    if (!args(i).startsWith("-")) {
//      if(args(i).endsWith(".scala"))
//        foundInt = true
//    }
//    i = i + 1
//  }


  // рекурсивная альтернатива

  @tailrec
  def searchFrom(i: Int): Int =
    if(i >= args.length) - 1
    else if (args(i).startsWith("i")) searchFrom(i + 1) // каждая инструкция continue заменена рекурсивным вызовом
    //  с использованием в качестве аргумента выражения i + 1, позволяющего эффективно переходить в следующему
    // целочисленному значению
    else if (args(i).endsWith(".scala")) i
    else searchFrom(i + 1)

  val i = searchFrom(0)

}
