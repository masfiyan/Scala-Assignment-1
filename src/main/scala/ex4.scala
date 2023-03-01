object ex4 {
  def higherOrder():Any = {
    passfunc()
  }
  def passfunc():Any={
    "-------the higher order is successfull------"
  }
  def main (args:Array[String]):Unit={
    println(higherOrder())
  }
}
