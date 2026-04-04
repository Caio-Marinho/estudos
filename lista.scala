@main
def lista(): Unit = {
  val lista: MinhaLista[Int] = MinhaLista(1, 2, 3, 4)
  lista.append(5)
  println(lista.mkString("[", ", ", "]"))  // saída: [1, 2, 3]
  lista.append(6,7,8,9)
  println(lista)
  val elemento = lista.pop(3)
  println(elemento)
  lista.remove(7)
  println(lista)
  lista.del(3,6)
  println(lista)
  val posicaoFinalLista = lista.length - 1
  val listaInvertida: MinhaLista[Int] = lista.slice(step = -1)
  println(listaInvertida)
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