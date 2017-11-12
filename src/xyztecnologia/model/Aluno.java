package xyztecnologia.model;

import javax.swing.JOptionPane;
import java.io.Serializable;

/**
 *
 * @author Dawitt Ralph
 */
public class Aluno extends Pessoa implements Serializable{
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

    public void listarAluno() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
