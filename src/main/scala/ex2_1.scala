object ex2_1 {
  def set(count : Int): Int = {
    val s = Set(1,2)
    if (count < 3) {
      println("the element is exit index %d is %d",count,s(count))
      set(count+1)
    } else {
      0
    }
  }
  def main(arge:Array[String])={
    println(set(1))






  }

}
