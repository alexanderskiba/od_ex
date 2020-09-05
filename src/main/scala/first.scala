object first extends App{

  def hello(string:String):Unit ={
    for (i <- 1 to 10)
      println(string)

  }

  hello("privet")

}
