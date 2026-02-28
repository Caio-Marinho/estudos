/**
 * =========================================================
 * 🚀 Exemplo 1 — Scala 3 usando @main
 * =========================================================
 *
 * A anotação @main transforma esta função
 * no ponto de entrada do programa.
 *
 * Não é necessário:
 *   - criar um object
 *   - declarar args: Array[String]
 *
 * O compilador gera automaticamente a estrutura
 * compatível com a JVM.
 */

/*@main
def HelloWorld(): Unit =
*/
  /**
   * Declaração de variável imutável.
   *
   * val → não pode ser reatribuída
   * : String → tipagem explícita (opcional)
   
  val nome: String = "Caio"
   */
  /**
   * Interpolação de string:
   *
   * O prefixo 's' permite inserir variáveis com $.
   
  print(s"Olá, ${nome}\n")
   */
  /**
   * println já adiciona quebra de linha automaticamente.
   
  println("Hello world! Scala3")

   */

/**
 * =========================================================
 * ☕ Exemplo 2 — Scala 2 (Padrão clássico da JVM)
 * =========================================================
 *
 * Aqui usamos o modelo tradicional exigido pela JVM:
 *
 *   object Nome {
 *     def main(args: Array[String]): Unit
 *   }
 *
 * A JVM procura exatamente esse formato
 * para iniciar a execução.
 */

object HelloWorld {

  /**
   * Método principal padrão da JVM.
   *
   * args: Array[String]
   * → recebe argumentos da linha de comando.
   *
   * Unit → equivalente ao void do Java.
   */
  def main(args: Array[String]): Unit = {

    val nome: String = "Caio"

    /**
     * Interpolação de string.
     */
    println(s"Olá, $nome")

    println("Hello world! Scala2")
  }
}