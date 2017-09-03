package xyztecnologia;

import javax.swing.JOptionPane;

/**
 *
 * @author Dawitt Ralph
 */
public class Professor extends Pessoa{
    private String lattes;
    private String email;
    private String formacao;
    private String especialidade;
    private int tipo;
    
    public void cadastrarProfessor(){
        super.cadastrarPessoa();
        lattes = JOptionPane.showInputDialog("Informe o lattes do professor");
        email = JOptionPane.showInputDialog("Informe o e-mail do professor");
        formacao = JOptionPane.showInputDialog("Informe a formação do professor");
        especialidade = JOptionPane.showInputDialog("Informe a especialidade do professor");
        tipo = Integer.parseInt(JOptionPane.showInputDialog("Informe o tipo do professor"));
    }
    
    public void exibirProfessor(){
        JOptionPane.showMessageDialog(null, "Dados de Professor"
              + "\n" + super.exibirPessoa()
              + "\nLattes: " + lattes
              + "\nE-mail: " + email
              + "\nFormação: " + formacao
              + "\nEspecialidade: " + especialidade
              + "\nTipo: " + tipo);
    }
}
