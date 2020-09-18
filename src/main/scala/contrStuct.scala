import java.io.{File, PrintWriter}
import java.util.Date

object contrStuct extends App {

  // введе методы, которые получают аргументы в виде функций
  // следующая структруа  повторяет операцию два раза и возвращает результат

  def twice(op: Double => Double, x: Double) = op(op(x))
  println(twice(_ + 1,5))
  // Double => Double означает то, что функция получает в качестве аргумента одно Double значение и возвращает другое

  //Шаблон, в котором рассмотрено открытие ресурса, работа с ним а затем закрытие

  def withPrintWriter(file: File, op: PrintWriter => Unit) = {
    val writer = new PrintWriter(file)
    try {
      op(writer)
    } finally {
      writer.close()
    }
  }

  // Воспользуемся данным методом
  withPrintWriter(new File("date.txt"), writer => writer.println(new Date))

  // использование шаблона временного пользования для записис в файл

  def withPrintWriter2(file:File)(op: PrintWriter => Unit) = {
    val writer = new PrintWriter(file)
    try {
      op(writer)
    } finally {
      writer.close()
    }
  }

  val file = new File("date2.txt")

  withPrintWriter2(file) {writer => writer.println(new Date)} // фигурные скобки только для одного параметра, можно
  // заменить на круглые
}
