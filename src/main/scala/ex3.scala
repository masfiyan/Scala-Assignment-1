object ex3 {
  def sum(n: Option[Int]): Int = {
    n.getOrElse(100)
  }
  def main(args: Array[String]): Unit = {
    println("the value is present",sum(Some(1)))
    println("the value is absent",sum(None))
  }
}






