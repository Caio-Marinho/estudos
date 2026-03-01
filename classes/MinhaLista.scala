// Classe genérica que pode armazenar elementos de qualquer tipo T
// O construtor aceita múltiplos elementos usando varargs (T*)
class MinhaLista[T](elems: T*) {

  // Lista interna privada, armazenando os elementos como List[T] imutável
  private var lista: List[T] = elems.toList

  // Adiciona um único elemento ao final da lista,
  //  lista:+= elem → cria uma lista com elem no final e substitui a antiga
  // O ':' indica que o operador é chamado no objeto da direita (associação à direita)
  def append(elem: T): Unit = {
    lista :+= elem
  }

  // Adiciona múltiplos elementos de uma vez (varargs)
  // Concatena a lista existente com os novos elementos
  // Aqui usamos elems.toList para garantir que os elementos sejam convertidos em List
  def append(elems: T*): Unit = {
    lista ++= elems.toList
  }

  // Permite aplicar uma função a cada elemento da lista
  def foreach(f: T => Unit): Unit = lista.foreach(f)

  // Retorna uma string com os elementos, usando início, separador e fim definidos
  def mkString(start: String, sep: String, end: String): String = lista.mkString(start, sep, end)

  // acessar elemento pelo índice
  def apply(index: Int): T = lista(index)

  // atualizar elemento
  def update(index: Int, value: T): Unit = {
    lista = lista.updated(index, value)
  }

  // retorna o tamanho da lista
  def length: Int = lista.length
  
  // Sobrescreve o toString para exibir a lista no formato [elem1, elem2, ...]
  override def toString: String = lista.mkString("[", ", ", "]")
}