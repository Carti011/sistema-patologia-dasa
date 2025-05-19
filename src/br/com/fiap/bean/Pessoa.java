package br.com.fiap.bean;

/**
 * Classe que representa uma pessoa genérica com nome e CPF.
 * Serve como classe base para outras especializações, como Médico.
 * @author Weslley
 */
public class Pessoa {
    private String nome;
    private String cpf;

    /**
     * Construtor padrão.
     */
    public Pessoa() {}

    /**
     * Construtor com parâmetros para inicializar nome e CPF.
     * @param nome Nome da pessoa
     * @param cpf  CPF da pessoa
     */
    public Pessoa(String nome, String cpf) {
        this.nome = nome;
        this.cpf = cpf;
    }

    public String getNome() { return nome; }

    public String getCpf() { return cpf; }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    /**
     * Retorna uma representação textual da pessoa com nome e CPF.
     * @return String formatada com nome e CPF
     */
    public String apresentar() {
        return "Nome: " + nome + ", CPF: " + cpf;
    }
}
