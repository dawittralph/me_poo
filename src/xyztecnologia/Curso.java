package xyztecnologia;

import javax.swing.JOptionPane;

/**
 *
 * @author Dawitt Ralph
 */
public class Curso{
    private String nome;
    private int cargaHoraria;
    private double valor;
    private String descricao;
    
    Professor pr = null;
    Professor professor[] = new Professor[1];
    
    Aluno al = null;
    Aluno aluno[] = new Aluno[2];
    
    public void cadastrarCurso(){
        nome = JOptionPane.showInputDialog("Informe o nome do curso");
        cargaHoraria = Integer.parseInt(JOptionPane.showInputDialog("Informe a carga horária do curso"));
        valor = Double.parseDouble(JOptionPane.showInputDialog("Informe o valor do curso"));
        descricao = JOptionPane.showInputDialog("Informe a descrição do curso");
        
        pr = new Professor();
        pr.cadastrarProfessor();
        professor[0] = pr;
        
        for (int i = 0; i < 2; i++) {
            al = new Aluno();
            al.cadastrarAluno();
            aluno[i] = al;
        }
    }
    
    public void exibirCurso(){
        JOptionPane.showMessageDialog(null,"Nome: " + nome
              + "\nCarga Horária: " + cargaHoraria
              + "\nValor: R$" + valor
              + "\nDescrição: " + descricao);
        professor[0].exibirProfessor();
        for (int i = 0; i < 2; i++) {
            aluno[i].exibirAluno();
        }
    }
}
