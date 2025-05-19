package br.com.fiap.bean;

import java.time.LocalDate;

/*** Classe que representa um laudo médico gerado a partir de uma amostra de tecido.
 * Contém informações do médico responsável, amostra analisada, descrição e data de emissão.
 * @author Weslley*/
public class Laudo {
    private String codigo;
    private Medico medico;
    private Amostra amostra;
    private String descricao;
    private LocalDate dataEmissao;

    /*** Construtor completo do laudo.
     * @param codigo       Código de identificação do laudo
     * @param medico       Médico responsável
     * @param amostra      Amostra analisada
     * @param descricao    Descrição do resultado da análise
     * @param dataEmissao  Data de emissão do laudo*/
    public Laudo(String codigo, Medico medico, Amostra amostra, String descricao, LocalDate dataEmissao) {
        this.codigo = codigo;
        this.medico = medico;
        this.amostra = amostra;
        this.descricao = descricao;
        this.dataEmissao = dataEmissao;
    }

    // Getters
    public String getCodigo() { return codigo; }
    public Medico getMedico() { return medico; }
    public Amostra getAmostra() { return amostra; }
    public String getDescricao() { return descricao; }
    public LocalDate getDataEmissao() { return dataEmissao; }

    // Setters
    public void setCodigo(String codigo) { this.codigo = codigo; }
    public void setMedico(Medico medico) { this.medico = medico; }
    public void setAmostra(Amostra amostra) { this.amostra = amostra; }
    public void setDescricao(String descricao) { this.descricao = descricao; }
    public void setDataEmissao(LocalDate dataEmissao) { this.dataEmissao = dataEmissao; }

    /*** Exibe um resumo do laudo, incluindo informações do médico e amostra.
     * @return String formatada com detalhes do laudo*/
    public String gerarResumo() {
        return "Laudo #" + codigo + "\n"
                + "Data: " + dataEmissao + "\n"
                + "Médico: " + medico.apresentar() + "\n"
                + "Amostra: " + amostra.getCodigo() + " | Volume: " + amostra.calcularVolume() + " mm³ | Tamanho: " + amostra.classificarTamanho() + "\n"
                + "Descrição: " + descricao;
    }
}
