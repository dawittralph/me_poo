package xyztecnologia.model;

import javax.swing.JOptionPane;
import xyztecnologia.view.AlunoView;
import xyztecnologia.view.CursoView;
import xyztecnologia.view.ProfessorView;

/**
 *
 * @author Dawitt Ralph
 */
public class Curso{
    private String nome;
    private int cargaHoraria;
    private double valor;
    private String descricao;
    
    public void cadastrarCurso(){
        nome = JOptionPane.showInputDialog("Informe o nome do curso");
        cargaHoraria = Integer.parseInt(JOptionPane.showInputDialog("Informe a carga horária do curso"));
        valor = Double.parseDouble(JOptionPane.showInputDialog("Informe o valor do curso"));
        descricao = JOptionPane.showInputDialog("Informe a descrição do curso");
    }
    
    public Double retornaValor(){
        return valor;
    }
    
    public void exibirCurso(){
        JOptionPane.showMessageDialog(null,"Nome: " + nome
              + "\nCarga Horária: " + cargaHoraria
              + "\nValor: R$" + valor
              + "\nDescrição: " + descricao);
    }
}
