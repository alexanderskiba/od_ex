import java.io.FileReader
import java.io.FileNotFoundException
import java.io.IOException
object exceptions extends App {

  try {
    val f = new FileReader("input.txt")
    //использование и закрытие файла
  } catch {
    case ex: FileNotFoundException => // обработка ошибки отсутствия файла
    case ex: IOException => // Обработка других ошибок ввода-вывода
  }
//  val n = 4
//  val half =
//    if(n % 2 ==0)
//      n /2
//    else
//      throw new RuntimeException("n must be even")

}
