object ChapterEleven extends App {

  class Dollars(val amount: Int) extends AnyVal {
    override def toString: String = "$" + amount
  }

  val money = new Dollars(100000)

  println(money.amount)
  println(money)

  class Anchor(val value: String) extends AnyVal
  class Style(val value: String) extends AnyVal
  class Text(val value: String) extends AnyVal
  class Html(val value: String) extends AnyVal

  def title(text: Text, anchor: Anchor, style:
  Style): Html =
    new Html(s"<a id='${anchor.value}'>" +
        s"<h1 class='${style.value}'>" +
        text.value +
        "</h1></a>")

//  println(title("chap:vcls", "bold", "Value Classes"))
}
