import scala.io.Source
object LongLines extends App {
  def processFile(filename: String, width: Int) = {
    def processLine(line: String) = {
      if (line.length > width) // width получаем из метода processFile тк находимся в области видимости
        println(filename + ": " + line.trim)
    }

    val source = Source.fromFile(filename)
    for (line <- source.getLines())
      processLine(line)
  }
}