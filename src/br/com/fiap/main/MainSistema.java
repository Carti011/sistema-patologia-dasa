package br.com.fiap.main;

import br.com.fiap.bean.*;

import javax.swing.JOptionPane;
import java.time.LocalDate;

/*** Classe principal que executa o sistema de patologia da Dasa.
 * Realiza testes automáticos (mocados) e entrada de dados pelo usuário via JOptionPane.
 * @author Weslley*/
public class MainSistema {
    public static void main(String[] args) {

        SistemaMedico sistema = new SistemaMedico();

        //  Teste mocado
        Medico medico1 = new Medico("Dr. Ricardo Lima", "123.456.789-00", "CRM-SP12345");
        Amostra amostra1 = new Amostra("A001", 20.0, 10.0, 5.0);
        sistema.cadastrarMedico(medico1);
        sistema.cadastrarAmostra(amostra1);
        sistema.gerarLaudo("L001", medico1, amostra1, "Amostra apresenta características compatíveis com tecido saudável.");

        //  Teste manual com JOptionPane
        String escolha;

        do {
            try {
                String nome = JOptionPane.showInputDialog("Digite o nome do médico:");
                String cpf = JOptionPane.showInputDialog("Digite o CPF do médico:");
                String crm = JOptionPane.showInputDialog("Digite o CRM do médico:");
                Medico medicoUsuario = new Medico(nome, cpf, crm);
                sistema.cadastrarMedico(medicoUsuario);

                String codAmostra = JOptionPane.showInputDialog("Digite o código da amostra:");
                double comprimento = Double.parseDouble(JOptionPane.showInputDialog("Digite o comprimento (mm):"));
                double largura = Double.parseDouble(JOptionPane.showInputDialog("Digite a largura (mm):"));
                double profundidade = Double.parseDouble(JOptionPane.showInputDialog("Digite a profundidade (mm):"));
                Amostra amostraUsuario = new Amostra(codAmostra, comprimento, largura, profundidade);
                sistema.cadastrarAmostra(amostraUsuario);

                String codLaudo = JOptionPane.showInputDialog("Digite o código do laudo:");
                String descricao = JOptionPane.showInputDialog("Digite a descrição do laudo:");
                sistema.gerarLaudo(codLaudo, medicoUsuario, amostraUsuario, descricao);

                JOptionPane.showMessageDialog(null, "Laudo gerado com sucesso!");

            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "Erro ao cadastrar: " + e.getMessage());
            }

            escolha = JOptionPane.showInputDialog("Deseja cadastrar outro laudo? (Sim/Não)");
        } while (escolha != null && escolha.equalsIgnoreCase("Sim"));

        sistema.listarLaudos();
    }
}
