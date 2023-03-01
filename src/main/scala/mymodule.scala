object mymodule {
  def abc(n:Int) = {
    if (n<0){
      -n
    } else {
      n
    }
  }
  private def fromatAbs(x:Int)={
    val msg = "the absolut of %d is %d"
    msg.format(x,abc(x))
  }
  def main(args:Array[String])={
    println(fromatAbs(42))
    println(2 + 3)
    println(2.+(3))
    println(abc(3))
  }
}
