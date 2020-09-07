object for_loop extends App{

  //код ниже выводит имена всех файлов,
  //содержащихся в текущем каталоге. Ввод-вывод выполняется с
  //использованием API Java. Сначала в текущем каталоге «.» создается
  //файл java.io.File и вызывается его метод listFiles. Этот метод
  //возвращает массив File-объектов, по одному на каталог, и файл,
  //содержащийся в текущем каталоге. Получившийся в результате
  //массив сохраняется в переменной filesHere.

  val filesHere = (new java.io.File(".")).listFiles
  for (file <- filesHere) // такой сиснтаксис называется генератором
    println(file)

  for (i <- 1 to 5)
    println("Iteration " + i)

  // Фильтрация

//  for (file <- filesHere) if
//  (file.getName.endsWith(".scala"))
//      println(file)

  for (
    file <- filesHere
    if file.isFile
    if file.getName.endsWith(".scala")
  ) println(file)

  println("ВЛОЖЕННЫЕ ЦИКЛЫ")

  def fileLines(file: java.io.File) =
    scala.io.Source.fromFile(file).getLines().toList

//  def grep(pattern: String) =
//    for (
//      file <- filesHere
//      if file.getName.endsWith(".scala");
//      line <- fileLines(file)
//      if line.trim.matches(pattern)
//    ) println(file + ": " + line.trim)
//  grep(".*gcd.*")

  // промежуточное присваивание в выражении for

  def grep(pattern: String) =
    for {
      file <- filesHere
      if file.getName.endsWith(".Scala")
      line <- fileLines(file)
      trimmed = line.trim // промежуточное присваивание
      if (trimmed.matches(pattern))
    } println(file + ":" + trimmed)

  grep(".*gcd.*")

  //функция, идентифицирующую файлы с
  //расширением .scala и сохраняющую их имена в массиве

  def scalaFiles =
    for {
      file <- filesHere
      if file.getName.endsWith(".scala")
    } yield file

  println(scalaFiles)

  val forLineLengths =
    for {
      file <- filesHere
      if file.getName.endsWith(".scala")
      line <- fileLines(file)
      trimmed = line.trim
      if trimmed.matches(".*for*.")
    } yield trimmed.length

  println(forLineLengths)

}
