
package xyztecnologia;

import javax.swing.JOptionPane;

/**
 *
 * @author Dawitt Ralph
 */
public class Pessoa extends Endereco{
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
        cpf = JOptionPane.showInputDialog("Informe o o C.P.F.");
        while (cpf.length() != 11) {
            JOptionPane.showMessageDialog(null, "O C.P.F. informado inválido");
            cpf = JOptionPane.showInputDialog("Entre com o C.P.F.");
        }
        fone = JOptionPane.showInputDialog("Informe o telefone");
        super.cadastrarEndereco();
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
