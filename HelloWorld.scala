@main
def main(): Unit =
  val nome:String = "Caio"
  print(s"Olá,${nome}\n")
  println("Hello world! Scala3")

object HelloWorld {
  def main(args: Array[String]): Unit = {
    val nome:String = "Caio"
    println(s"Olá, $nome")
    println("Hello world! Scala2")
  }
}