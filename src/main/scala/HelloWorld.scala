
object HelloWorld {
  def main(args: Array[String]): Unit = {
    val hi = new JavaHelloWorld

    println(hi.getHello)
    testPrint
  }

  def testPrint:Unit =
    println("I am following identing style")
}
