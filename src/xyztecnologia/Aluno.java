package xyztecnologia;

import javax.swing.JOptionPane;

/**
 *
 * @author Dawitt Ralph
 */
public class Aluno extends Pessoa{
    private String matricula;
    private String celular;
    
    public void cadastrarAluno(){
        super.cadastrarPessoa();
        matricula = JOptionPane.showInputDialog("Informe a matrícula do aluno");
        celular = JOptionPane.showInputDialog("Informe o celular do aluno");
    }
    
    public void exibirAluno(){
        JOptionPane.showMessageDialog(null, "Dados do Aluno"
              + "\n" + super.exibirPessoa()
              + "\nMatrícula: " + matricula
              + "\nCelular: " + celular);
    }
    
}
