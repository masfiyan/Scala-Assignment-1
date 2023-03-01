object ex1 {
//  def arr(): Int={
    val ar = Array(1,2,3)

    def go(count :Int,len:Int):Int={
      if (count < len){
        val num = ar(count)
        println(num)
        go(count + 1,3)


      } else{
        0
      }
    }


  def main(args: Array[String]): Unit = {
    println(go(0,3))

  }

}

