/**
 * ==============================================
 * 📥 Programa de Leitura e Soma de Dois Inteiros
 * ==============================================
 *
 * Este programa:
 *   1) Solicita dois números inteiros ao usuário
 *   2) Lê os valores digitados no console
 *   3) Calcula a soma
 *   4) Exibe o resultado formatado
 *
 * ==============================================
 * 🔎 Importação
 * ==============================================
 *
 * import scala.io.StdIn._
 *
 * Importa todos os métodos do objeto StdIn,
 * permitindo usar diretamente:
 *
 *   - readInt()
 *   - readLine()
 *   - readDouble()
 *
 * Sem esse import, seria necessário escrever:
 *
 *   scala.io.StdIn.readInt()
 *
 */
import scala.io.StdIn._

/**
 * Função principal do programa.
 *
 * Observação:
 * Aqui não estamos usando @main.
 * Portanto, esta é apenas uma função comum.
 *
 * Por isso, ao final do código, ela é chamada manualmente:
 *
 *   main()
 *
 * Tipo de retorno:
 *   Unit → equivalente a "void" no Java.
 */
def main(): Unit = {

  /**
   * print() exibe texto sem quebrar linha.
   */
  print("Informe o valor de x: ")

  /**
   * readInt() lê um número inteiro digitado pelo usuário.
   *
   * val → cria variável imutável
   * : Int → tipo explícito (opcional, pois Scala infere)
   */
  val x: Int = readInt()

  print("Informe o valor de y: ")
  val y: Int = readInt()

  /**
   * Operação matemática simples.
   *
   * Scala infere automaticamente que soma é do tipo Int.
   */
  val soma = x + y

  /**
   * Interpolação de String:
   *
   * O prefixo "s" permite inserir variáveis dentro da string
   * usando o símbolo $.
   *
   * Exemplo:
   *   s"Valor: $variavel"
   */
  println(s"Soma de x + y é : $soma")
}

/**
 * Chamada manual da função main.
 *
 * Necessário porque esta função não é anotada com @main
 * e não segue o padrão JVM:
 *
 *   def main(args: Array[String]): Unit
 */
main()