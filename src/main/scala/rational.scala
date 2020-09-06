object rational extends App {

  class Rational(n:Int, d:Int) {
    require(d != 0)
    override def toString: String = numer + "/" + denom
    private val g = gcd(n.abs, d.abs)
    val numer = n / g
    val denom = d / g

    def this(n: Int) = this(n, 1) // дополнительный конструктор

    def +(that: Rational): Rational = //that - это значение справа:  oneHalf + twoThirds
      new Rational(numer * that.denom + that.numer * denom,
        denom * that.denom)

    def +(i: Int): Rational =
      new Rational(numer + i * denom, denom)

    def -(that: Rational): Rational =
      new Rational(numer * that.denom - that.numer * denom, denom * that.denom)

    def -(i:Int): Rational =
      new Rational(numer - i * denom, denom)

    def *(that: Rational): Rational = // that - это значение справа:  oneHalf * twoThirds
      new Rational(numer * that.numer, denom * that.denom)

    def *(i: Int): Rational =
      new Rational(numer * i, denom)

    def /(that: Rational): Rational =
      new Rational(numer * that.denom, denom * that.numer)

    def /(i: Int): Rational =
      new Rational(numer, denom * i)

    private def gcd(a: Int, b: Int):Int =
      if(b == 0) a else gcd(b, a % b)

    def lessThan(that: Rational) =
      this.numer * that.denom < that.numer * this.denom

    def max(that: Rational) =
      if(this.lessThan(that)) that else this

  }
  implicit def intToRational(x: Int) = new Rational(x) // для того, чтобы можно
  // было поменять числа местами r * 2 и 2 * r

  val oneHalf = new Rational(1,2)
  val twoThirds = new Rational(2,3)
  val sixFives  = new Rational(6,5)
  val threeFist = new Rational(3)
  val yyyy = new Rational(66,42)
//  println(oneHalf + twoThirds)
//  println(oneHalf lessThan sixFives)
//  println(sixFives max twoThirds)
//  println(threeFist)
  println(yyyy)
  println(oneHalf * twoThirds)
  println(oneHalf * 5)

  val r = new Rational(2,3)
  println(2 * r)

}
