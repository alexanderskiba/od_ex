object MultiTableFunc extends App {

//  def makeRowSeq(row: Int): Int = {
//    for(col <- 1 to 10) yield {
//      val prod = (row * col).toString
//      val padding = " " * (4 - prod.length)
//      padding + prod
//    }
//    // возвращение строки в виде строкового значения
//    def makeRow(row: Int) = makeRowSeq(row).mkString
//    // возвращение таблицы в виде стрковых значений по одному значению
//    // на каждую строку
//    def multiTable() = {
//      val tableSeq = { // последовательность из строк таблицы
//      for (row <- 1 to 10)
//        yield makeRow(row)
//
//      tableSeq.mkString("\n")
//      }
//    }
//  }

  // Возвращение строчки в виде последовательности
  def makeRowSeq(row: Int) =
    for (col <- 1 to 10) yield {
      val prod = (row * col).toString
      val padding = " " * (4 - prod.length)
      padding + prod
    }
  // Возвращение строки в виде строкового значения
  def makeRow(row: Int) = makeRowSeq(row).mkString
  // Возвращение таблицы в виде строковых значений,
  //по одному значению
  // на каждую строку
  def multiTable() = {
    val tableSeq = // последовательность из строк
    //  таблицы
    for (row <- 1 to 10)
      yield makeRow(row)
    tableSeq.mkString("\n")
  }

  println(multiTable())

}
