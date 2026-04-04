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

  // Insere um elemento em uma posição específica da lista
  // Semelhante ao método insert do Python
  def insert(index: Int, value: T): Unit = {

    // Como List é imutável, precisamos criar uma nova lista
    // take(index) pega todos os elementos antes da posição informada
    // List(value) cria uma lista contendo apenas o novo elemento
    // drop(index) pega os elementos a partir da posição informada
    // O operador ++ concatena listas

    lista =
      lista.take(index) ++ // elementos antes do índice
        List(value) ++ // elemento a ser inserido
        lista.drop(index) // elementos a partir do índice (são deslocados para a direita)
  }

  // Permite aplicar uma função a cada elemento da lista
  def foreach(f: T => Unit): Unit = lista.foreach(f)

  def slice(
             start: Int = 0,
             end: Int = lista.length - 1,
             step: Int = 1
           ): MinhaLista[T] = {

    require(step != 0, "step não pode ser 0")

    val range = {
      if (step > 0 && start <= end)
        start until end by step
      else if (step < 0)
        end to start by step
      else
        0 until 0   // range vazio
    }

    val novaLista = range
      .filter(i => i >= 0 && i < lista.length)
      .map(lista(_))
      .toList

    new MinhaLista(novaLista: _*)
  }

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

  // remover por índice
  private def removeAt(index: Int): Unit = lista = lista.take(index) ++ lista.drop(index + 1)

  // remover por valor (remove todas as ocorrências)
  def remove(value: T): Unit = lista = lista.filterNot(_ == value)

  // remove e retorna último elemento ou elemento de índice específico
  def pop(index: Int = -1): T = {
    val i = if (index == -1) lista.length - 1 else index
    val elem = lista(i)
    removeAt(i)
    elem
  }

  // limpa toda a lista
  def clear(): Unit = lista = Nil

  // estilo Python del (remove por índice)
  def del(index: Int): Unit = removeAt(index)

  // Remove um intervalo [start, end) (end exclusivo)
  def del(start: Int, end: Int): Unit = {
    lista =
      lista.take(start) ++ // elementos antes do início
        lista.drop(end) // elementos depois do fim
  }
  
  // Sobrescreve o toString para exibir a lista no formato [elem1, elem2, ...]
  override def toString: String = lista.mkString("[", ", ", "]")
}