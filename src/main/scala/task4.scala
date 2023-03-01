import scala.collection.mutable.ArrayBuffer
object task4 {
  def even():Any= {
    val a = List . fill (100) ( util . Random . nextInt (100) )
    val a1 = ArrayBuffer[Int]()
    cont(0)
    def cont(count :Int ):Any={
      if (count < 100){

        if ( (a(count)%2) == 0) {
          a1 += a(count)
        }
        cont(count + 1)
      } else {
        println(a1)

      }
    }
  }
  def main(args:Array[String]):Unit={
    println(even)

  }
}
