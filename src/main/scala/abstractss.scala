import java.io.File

object abstractss extends App {
  private def filesHere = (new File(".")).listFiles

  def filesEnding(query:String) = filesMatching(query, _.endsWith(_))

  def filesContaining (query: String) =
    filesMatching(query, _.contains(_))

  def filesRegex(query: String) =
    filesMatching(query, _.matches(_))

  def filesMatching (query: String, matcher: (String, String) => Boolean) = {
    for (file <- filesHere; if matcher(file.getName, query))
      yield file
  }

  def containsNeg(nums: List[Int]): Boolean = {
    var exists = false
    for (num <-nums)
      if (num < 0)
        exists = true
    exists
  }
//
//  def containsOdd(nums: List[Int]): Boolean ={
//    var exists = false
//    for (num <- nums)
//      if (num% 2 == 0)
//        exists = true
//    exists
//  }
  def containsOdd(nums: List[Int]) = nums.exists(_ % 2 == 0)

  println(containsOdd(List(8)))

}
