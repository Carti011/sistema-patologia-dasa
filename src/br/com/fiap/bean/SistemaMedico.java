package br.com.fiap.bean;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

/*** Classe que simula o sistema de controle de médicos, amostras e laudos.
 * Permite cadastrar e listar os objetos relacionados à análise de patologia.
 * @author Weslley*/
public class SistemaMedico {
    private List<Medico> medicos = new ArrayList<>();
    private List<Amostra> amostras = new ArrayList<>();
    private List<Laudo> laudos = new ArrayList<>();

    /*** Adiciona um novo médico ao sistema.
     * @param medico Objeto do tipo Medico*/
    public void cadastrarMedico(Medico medico) {
        medicos.add(medico);
    }

    /*** Adiciona uma nova amostra ao sistema.
     * @param amostra Objeto do tipo Amostra*/
    public void cadastrarAmostra(Amostra amostra) {
        amostras.add(amostra);
    }

    /*** Gera um novo laudo e adiciona à lista de laudos.
     * @param codigo      Código do laudo
     * @param medico      Médico responsável
     * @param amostra     Amostra analisada
     * @param descricao   Resultado do laudo*/
    public void gerarLaudo(String codigo, Medico medico, Amostra amostra, String descricao) {
        Laudo laudo = new Laudo(codigo, medico, amostra, descricao, LocalDate.now());
        laudos.add(laudo);
    }

    /*** Lista todos os laudos gerados no sistema.*/
    public void listarLaudos() {
        for (Laudo laudo : laudos) {
            System.out.println(laudo.gerarResumo());
            System.out.println("-----------------------------------");
        }
    }
}
