class Piramide(private val n: Int){

  /**
   * Imprime uma pirâmide centralizada no console.
   *
   * ================================
   * 📐 REGRA MATEMÁTICA DA PIRÂMIDE
   * ================================
   *
   * Altura da pirâmide: n
   * Base da pirâmide: 2n - 1
   *
   * Para cada linha i (onde i varia de 1 até n):
   *
   * 1) Espaços à esquerda:
   * espaços = n - i
   *
   *    - Na primeira linha (i = 1) → n - 1 espaços
   *    - Na última linha (i = n) → 0 espaços
   *
   * 2) Estrelas:
   * estrelas = 2 * i - 1
   *
   * A quantidade de estrelas segue a sequência de números ímpares:
   * 1, 3, 5, 7, 9, ...
   *
   * Isso acontece porque:
   * 2*i - 1 sempre gera números ímpares.
   *
   * ================================
   * 🧠 EXEMPLO (n = 4)
   * ================================
   *
   * Linha 1 → 3 espaços | 1 estrela
   * Linha 2 → 2 espaços | 3 estrelas
   * Linha 3 → 1 espaço  | 5 estrelas
   * Linha 4 → 0 espaços | 7 estrelas
   *
   * Resultado:
   *
   * *
   * ***
   * *****
   * *******
   *
   * ================================
   * 🔎 OBSERVAÇÃO SOBRE "until"
   * ================================
   *
   * O range:
   * 1 until 2*i
   *
   * É equivalente a:
   * 1 to (2*i - 1)
   *
   * Porque "until" NÃO inclui o valor final.
   *
   * Isso é muito utilizado quando trabalhamos com arrays,
   * pois evita ultrapassar o índice máximo.
   */
  def construir(): Unit = {

    // Loop principal: controla cada linha
    for (i <- 1 to n) {

      // Espaços à esquerda
      for (_ <- 1 to (n - i)) {
        print(" ")
      }

      // Estrelas (usando until para gerar 2*i - 1 elementos)
      for (_ <- 1 until 2 * i) {
        print("*")
      }

      // Quebra de linha
      println()
    }
  }
}
