import scala.collection.mutable.ListBuffer
object task2 {
  val m = Map(97 -> "a",98 -> "b",99 -> "c",100 -> "d",101 -> "e",102 -> "f",103 -> "g",104 -> "h",105 -> "i",106 -> "j",107 -> "k",108 -> "l",109 -> "m",110 -> "n",111 -> "o",112 -> "p",113 -> "q",114 -> "r",115 -> "s",116 -> "t",117 -> "u",118 -> "v",119 -> "w",120 -> "x",121 -> "y",122 -> "z")
  val l = ListBuffer[String]()
  def CharArray(start : Int) :List[String]={
    if (start < 122) {
      l += m(start)
      CharArray(start + 1)
    } else {
      l.toList
    }
  }
  def main(args : Array[String]) : Unit = {
    println(CharArray(100))
  }
}