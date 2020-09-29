object Traits extends App {

  trait Philosophical {
    def philosophize() ={
      println("I consume memory, therefore I am!")
    }
  }

//  class Frog extends Philosophical {
//    override def toString = "green"
//  }

  val frog = new Frog
  println(frog.philosophize())

  val phil: Philosophical = frog
  println(phil.philosophize())


//  class Frog extends Animal with Philosophical {
//    override def toString = "green"
//  }

  class Animal
  trait HasLegs

  class  Frog extends Animal with Philosophical with HasLegs {
    override def toString = "green"
    override def philosophize(): Unit = {
      println("It ain't easy being " + toString + "!")
    }
  }

  val phrog: Philosophical = new Frog
  println(phrog.philosophize())

}
