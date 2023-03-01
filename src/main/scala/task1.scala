import scala.collection.mutable.ListBuffer
import scala.collection.mutable
object task1 {
  def abc(): Any= {
    val rand = new scala.util.Random()
    val lst = ListBuffer[Int]()
    val P_lst = ListBuffer[Int]()
    val map = mutable.Map[Int,Int]()
    def lst_func(count: Int): Unit = {
      if (count < 15) {
        lst += rand.between(50, 500)
        lst_func(count + 1)
      } else {
        elements(0, lst.toList)
        println("Random List = ",lst.toList)
      }
    }
    def elements(count: Int, lst: List[Int]): Unit = {
      if (count < 15) {
        prime(2,lst(count))
        elements(count + 1, lst)
      } else {
        println("prime number sorted = ",P_lst.toList.sortWith(_ < _))
        println("Map = ",dict(0))
      }
    }
    def prime(i:Int,n:Int): Unit = {
      def pi_loop(i: Int): Boolean = {
        if (i < n) {
          if (n.toFloat / i == n / i) {
            false
          } else {
            pi_loop(i + 1)
          }
        } else {
          true
        }
      }
      if (pi_loop(i) == true) {
        P_lst += n
      }
    }
    def dict(count : Int):Any={
      if (count < P_lst.length){
        map += (count -> P_lst(count))
        dict(count + 1)
      } else {
        map
      }
    }
    lst_func(0)
  }
  def main(args: Array[String]) = {
    println(abc())
  }
}