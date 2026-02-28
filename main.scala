@main
def main():Unit = {
  val calc = new Calculadora()
  val soma:Int = calc.soma(3,3).toInt
  println(soma)
  val piramide = new Piramide(soma)
  piramide.construir()
}