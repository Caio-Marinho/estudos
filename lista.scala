@main
def lista(): Unit = {
  val lista: MinhaLista[Int] = MinhaLista(0,1, 2, 3, 4)
  lista.foreach(print)
  lista.append(5)
  println(" ")
  println(lista.mkString("[", ", ", "]"))  // saída: [1, 2, 3]
  lista.append(6,7,8,9)
  println(lista.length)
  lista2()
}
def lista2(): Unit = {
  val lista: MinhaLista[String] = MinhaLista("Caio")
  lista.foreach(println)
  lista.append("Pedro")
  println(lista.mkString("[", ", ", "]"))  // saída: [1, 2, 3]
  lista.append("Thiago","Jonas")
  lista(0)="Hugo"
  println(lista)
}