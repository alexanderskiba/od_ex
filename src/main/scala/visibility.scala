object visibility extends App {

  def printMultiTable() = {
    var i = 1
    // здесь в области видимости только перменная i
    while (i <= 10) {
      var j = 1
      // здесь в области видимости i, j
      while (j <= 10) {
        val prod = (i * j).toString
        //здесь в области видимости i, j, prod
        var k = prod.length
        // здесь в области видимости i, j, prod, k
        while (k < 4) {
          print(" ")
          k +=1
        }
        print(prod)
        j += 1
      }
      // i, j все еще в области видимости, а prod и  k - уже нет
      println()
      i += 1
    }
    // i в област видимости а i, j, prod, k - уже нет
  }
  printMultiTable()

}
