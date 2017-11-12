package xyztecnologia.model;

import javax.swing.JOptionPane;

/**
 *
 * @author Dawitt Ralph
 */
public class Endereco {
    private String logradouro;
    private String numero;
    private String complemento;
    private String bairro;
    private String cidade;
    private String uf;
    private String cep;
    
    public void cadastrarEndereco(){
        logradouro = JOptionPane.showInputDialog("Informe o logradouro");
        numero = JOptionPane.showInputDialog("Informe o número");
        complemento = JOptionPane.showInputDialog("Informe o complemento");
        bairro = JOptionPane.showInputDialog("Informe o bairro");
        cidade = JOptionPane.showInputDialog("Informe a cidade");
        uf = JOptionPane.showInputDialog("Informe o U.F.");
        cep = JOptionPane.showInputDialog("Informe o C.E.P.");
    }
    
    public void exibirEndereco(){
        JOptionPane.showMessageDialog(null,"Logradouro: " + logradouro
            + "\nNúmero: " + numero
            + "\nComplemento: " + complemento
            + "\nBairro: " + bairro
            + "\nCidade: " + cidade
            + "\nUF: " + uf
            + "\nC.E.P.: " + cep);
    }
}
