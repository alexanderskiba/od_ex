import parameter.assertionEnabled

object parameter extends App {
  // параметры до востребования
  var assertionEnabled = true

  def myAssert(predicate: () => Boolean) =
    if(assertionEnabled && !predicate())
      throw new AssertionError

  //неудобно будет пользоваться
  println(myAssert(() => 5 > 3))
//  myAssert(5 > 3) // Не будет работать из-за отсутствия () =>

  // Чтобы создать параметр
  //до востребования, задавать его тип нужно с обозначения =>, а не с
  //() =>
  def byNameAssert(predicate: => Boolean) =
    if(assertionEnabled && !predicate)
      throw new AssertionError

  println(byNameAssert(5>3))

  // реализаци без параметра до востребования
  def boolAssert(predicate: Boolean) =
    if (assertionEnabled && !predicate)
      throw new AssertionError

//  boolAssert(5 > 3)

  // разница в том, что в последнем случае выражение в круглых скобках вычисляется до вызова boolAssert
  // ниже будет пример
  val x = 5
  assertionEnabled = true

//  boolAssert(x / 0 == 0) // будет исключение ArithmeticException
//  byNameAssert(x / 0 == 0)
}
