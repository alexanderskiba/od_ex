package printmenu
import bobsdelights.Fruits
import bobsdelights.showFruit

object PrintMenu {
  def main(args: Array[String]): Unit = {
    for (fruit <- Fruits.menu) {
      showFruit(fruit)
    }
  }
}