object methods extends App {

  def echo(args: String*) =
    for (arg <- args) println(arg)

  echo()
  echo("One", "two", "Three")

  //
  //  def approximate(guess: Double): Double =
  //    if (isGoodEnough(guess)) guess
  //    else approximate(improve(guess))
  def boom(x: Int): Int = {
    if (x == 0) throw new Exception("boom!")
    else boom(x - 1) + 1

  }

  val funValue = nestedFun _
  def nestedFun(x: Int) : Unit = {
    if (x != 0) {
      println(x)
      funValue(x - 1)
    }
  }

}


