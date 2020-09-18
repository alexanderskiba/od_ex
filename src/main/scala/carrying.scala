object carrying extends App {

  def plainOldSum(x: Int, y: Int): Int = x + y
  println(plainOldSum(2,2))

  // каррированая функция, вместо списка из параметров x, y функция применяется к двум спискам,
  // в каждом из которых содержится по одному параметру

  def curriedSum(x: Int)(y: Int) = x + y
  println(curriedSum(1)(2))
  // получаем здесь два вызова функции

  // ниже иллюстрация процесса карринга
  def first(x: Int) = (y: Int) => x + y
  val second = first(1)
  println(second(1))

  val onePlus = curriedSum(1)_ // знак подчеркивания является заместитеем для второго списка
  // в итоге получили функцию, которая к заданному числу прибавляет единицу

  println(onePlus(5))

}
