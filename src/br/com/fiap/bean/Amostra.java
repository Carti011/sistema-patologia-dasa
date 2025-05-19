package br.com.fiap.bean;

/*** Classe que representa uma amostra de tecido para análise patológica.
 * Contém dimensões físicas da amostra e permite calcular seu volume.
 * @author Weslley*/
public class Amostra {
    private String codigo;
    private double comprimento;
    private double largura;
    private double profundidade;

    /*** Construtor padrão.*/
    public Amostra() {}

    /*** Construtor com parâmetros.
     * @param codigo       Código de identificação da amostra
     * @param comprimento  Comprimento em milímetros
     * @param largura      Largura em milímetros
     * @param profundidade Profundidade em milímetros*/
    public Amostra(String codigo, double comprimento, double largura, double profundidade) {
        this.codigo = codigo;
        this.comprimento = comprimento;
        this.largura = largura;
        this.profundidade = profundidade;
    }

    // Getters e Setters
    public String getCodigo() { return codigo; }
    public void setCodigo(String codigo) { this.codigo = codigo; }

    public double getComprimento() { return comprimento; }
    public void setComprimento(double comprimento) { this.comprimento = comprimento; }

    public double getLargura() { return largura; }
    public void setLargura(double largura) { this.largura = largura; }

    public double getProfundidade() { return profundidade; }
    public void setProfundidade(double profundidade) { this.profundidade = profundidade; }

    /*** Calcula o volume da amostra em milímetros cúbicos (mm³).
     * @return volume da amostra*/
    public double calcularVolume() {
        return comprimento * largura * profundidade;
    }

    /*** Classifica a amostra com base em seu volume.
     * @return String com a classificação (Pequena, Média, Grande)*/
    public String classificarTamanho() {
        double volume = calcularVolume();

        if (volume < 1000) {
            return "Pequena";
        } else if (volume < 5000) {
            return "Média";
        } else {
            return "Grande";
        }
    }
}
