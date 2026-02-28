

final class aplicando_input$_ {
def args = aplicando_input_sc.args$
def scriptPath = """aplicando_input.sc"""
/*<script>*/
import scala.io.StdIn._


def main(): Unit = {
  print("Informe o valor de x: ")
  val x: Int = readInt();
  print("Informe o valor de y: ")
  val y: Int = readInt();
  val soma = x + y;
  println(s"Soma de x + y é : $soma")
}
main()
/*</script>*/ /*<generated>*//*</generated>*/
}

object aplicando_input_sc {
  private var args$opt0 = Option.empty[Array[String]]
  def args$set(args: Array[String]): Unit = {
    args$opt0 = Some(args)
  }
  def args$opt: Option[Array[String]] = args$opt0
  def args$: Array[String] = args$opt.getOrElse {
    sys.error("No arguments passed to this script")
  }

  lazy val script = new aplicando_input$_

  def main(args: Array[String]): Unit = {
    args$set(args)
    val _ = script.hashCode() // hashCode to clear scalac warning about pure expression in statement position
  }
}

export aplicando_input_sc.script as `aplicando_input`

