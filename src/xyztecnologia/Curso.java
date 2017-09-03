package xyztecnologia;

import javax.swing.JOptionPane;

/**
 *
 * @author Dawitt Ralph
 */
public class Curso {
    private String nome;
    private int cargaHoraria;
    private double valor;
    private String descricao;

    private void cadastrarCurso(){
        nome = JOptionPane.showInputDialog("Informe o nome do curso");
        cargaHoraria = Integer.parseInt(JOptionPane.showInputDialog("Informe a carga horária do curso"));
        valor = Double.parseDouble(JOptionPane.showInputDialog("Informe o valor do curso"));
        descricao = JOptionPane.showInputDialog("Informe a descrição do curso");
    }
    
    private void exibirCurso(){
        JOptionPane.showMessageDialog(null,"Nome: " + nome
              + "\nCarga Horária: " + cargaHoraria
              + "\nValor: " + valor
              + "\nDescrição: " + descricao);

    }
}
