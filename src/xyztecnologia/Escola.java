package xyztecnologia;

import javax.swing.JOptionPane;

/**
 *
 * @author Dawitt Ralph
 */
public class Escola {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Inicialização do Objeto Aluno
        int opc=0;
        Aluno aluno = new Aluno();
        Professor professor = new Professor();
        Curso curso = new Curso();
        
        while(opc!=7){
         opc = Integer.parseInt(JOptionPane.showInputDialog(""
              + "XYZ Tecnologia"
              + "\n1 - Cadastrar Curso"
              + "\n2 - Exibir Curso"
              + "\n3 - Cadastrar Alunos"
              + "\n4 - Exibir Alunos"
              + "\n5 - Cadastrar Professor"
              + "\n6 - Exibir Professor"
              + "\n7 - Sair"));
                
        switch(opc){
         case 1:curso.cadastrarCurso();
         break;
         case 2:curso.exibirCurso();
         break;
         case 3:aluno.cadastrarAluno();
         break;
         case 4:aluno.exibirAluno();
         break;
         case 5:professor.cadastrarProfessor();
         break;
         case 6:professor.exibirProfessor();
         break;
         case 7:JOptionPane.showMessageDialog(null, "Saindo do sistema");
         break;
         default:JOptionPane.showMessageDialog(null, "As opções são somente de 1 a 7");
        }
        }
    }
}
