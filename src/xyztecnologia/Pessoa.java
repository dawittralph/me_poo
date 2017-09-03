
package xyztecnologia;

import javax.swing.JOptionPane;

/**
 *
 * @author Dawitt Ralph
 */
public class Pessoa {
    private String nome;
    private String dtNasc;
    private int idade;
    private String rg;
    private String cpf;
    private String fone;
    
    public void cadastrarPessoa(){
        nome = JOptionPane.showInputDialog("Informe o nome");
        dtNasc = JOptionPane.showInputDialog("Informe a data de nascimento");
        idade = Integer.parseInt(JOptionPane.showInputDialog("Informe a idade"));
        rg = JOptionPane.showInputDialog("Informe o R.G.");
        cpf = JOptionPane.showInputDialog("Informe o o C.P.f.");
        fone = JOptionPane.showInputDialog("Informe o telfone");
    }
    
    public String exibirPessoa(){
        String dados = "Nome: " + nome
              + "\nData de Nascimento: " + dtNasc
              + "\nCPF: " + cpf
              + "\nRG: " + rg
              + "\nIdade: " + idade
              + "\nTelefone: " + fone;
      return dados;
    }
}
