import scala.collection.mutable
object task5 {
  def buildMap():Any= {
    val lst = Array(1, 2, 3, 4, 5)
    val map = mutable.Map[Int, Boolean]()
    def func(x: Int): Boolean = {
      x % 2 == 0
    }
    def seq(count: Int): Any = {
      if (count < lst.length) {
        map += (lst(count) -> func(lst(count)))
        seq(count + 1)
      } else {
        println(map)
      }
    }
    seq(0)
  }
    def main(args:Array[String]):Unit={
      print(buildMap())
    }
}
