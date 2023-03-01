import scala.collection.mutable.ArrayBuffer
object task3 {
  val a1 = Array(1,2,3)
  val a2 = Array(4,5,6)
  val a3 = ArrayBuffer[Int]()
  def Sum(count : Int):Any={
    if (count < a1.length){
      a3 += a1(count) + a2(count)
      Sum(count + 1)
    } else {
      a3
    }
  }
  def main(args : Array[String]) : Unit = {
    println(Sum(0))



  }
}
