import for_loop.filesHere
import methods.boom

val hex = 0x5
val magic = 0xcafebabe
val longSum = 1 + 2L

val string = "sdfdsfdfvsdvxzfsdf"
string.indexOf('d',2)

'a' - 'd'

0 max 5
"bob".capitalize
-2.7.abs.round

def greet() = {println("hi!")}
() == greet()

val line = "       asda sdsdfs df"
line.trim

def sum(a: Int, b: Int, c: Int) = a + b + c
sum(1,2,3)
val a = sum _

a(1,3,2)

val someNumbers = List(-11, -10, -5, 0, 5, 10)

var sum = 11

someNumbers.foreach(sum += _)
sum

def  boom (x: Int) : Int =
  if (x == 0) throw new Exception("boom!")
  else boom(x-1)

boom(3)
