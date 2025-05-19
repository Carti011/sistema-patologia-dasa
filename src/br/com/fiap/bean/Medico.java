package br.com.fiap.bean;

/*** Classe que representa um médico, herda de Pessoa e adiciona o atributo CRM.
 * Médicos são responsáveis por analisar amostras e emitir laudos.
 * @author Weslley*/
public class Medico extends Pessoa {
    private String crm;

    /*** Construtor padrão. */
    public Medico() {
        super(); // Chama o construtor da classe Pessoa
    }

    /*** Construtor com parâmetros.
     * @param nome Nome do médico
     * @param cpf  CPF do médico
     * @param crm  CRM do médico*/
    public Medico(String nome, String cpf, String crm) {
        super(nome, cpf);
        this.crm = crm;
    }

    public String getCrm() { return crm; }

    public void setCrm(String crm) { this.crm = crm; }

    /*** Retorna uma apresentação do médico com nome, CPF e CRM.
     * Este método sobrescreve o método apresentar da classe Pessoa.
     * @return String com dados do médico*/
    @Override
    public String apresentar() {
        return super.apresentar() + ", CRM: " + crm;
    }
}
