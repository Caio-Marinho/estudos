/**
 * ==============================================
 * 📥 Programa de Entrada de Dados e Soma
 * ==============================================
 *
 * Este programa:
 *  1) Solicita dois números inteiros ao usuário
 *  2) Lê os valores digitados via console
 *  3) Calcula a soma
 *  4) Exibe o resultado formatado
 *
 * ==============================================
 * 🔎 IMPORTANTE
 * ==============================================
 *
 * import scala.io.StdIn._
 *
 * Importa todos os métodos do objeto StdIn,
 * permitindo utilizar funções como:
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
 * @main transforma esta função no ponto de entrada da aplicação.
 * Equivalente ao "public static void main" do Java.
 */
@main
def aplicando_inputl(): Unit = {

  /**
   * Solicita o primeiro valor ao usuário.
   * print() não quebra linha.
   */
  print("Informe o valor de x: ")

  /**
   * readInt() lê um número inteiro digitado no console.
   *
   * O tipo é explicitamente declarado:
   * val x: Int
   *
   * Scala poderia inferir o tipo automaticamente,
   * mas aqui deixamos explícito por clareza.
   */
  val x: Int = readInt()

  print("Informe o valor de y: ")
  val y: Int = readInt()

  /**
   * Operação matemática simples.
   * O tipo de soma será Int (inferido automaticamente).
   */
  val soma = x + y

  /**
   * Interpolação de String
   *
   * O prefixo 's' permite inserir variáveis dentro da string
   * usando o símbolo $.
   *
   * Exemplo:
   *   s"Valor: $variavel"
   */
  println(s"Soma de x + y é : $soma")
}