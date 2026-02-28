import scala.io.StdIn._

@main
def aplicando_inputl(): Unit = {
  print("Informe o valor de x: ")
  val x: Int = readInt();
  print("Informe o valor de y: ")
  val y: Int = readInt();
  val soma = x + y;
  println(s"Soma de x + y é : $soma")
}