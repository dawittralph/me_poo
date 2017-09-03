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
        int opc=0;
        // Inicialização do Objeto Aluno
        Aluno aluno = new Aluno();
        //Inicialização do Objeto Professor
        Professor professor = new Professor();
        //Inicialização do Objeto Curso
        Curso curso = new Curso();
        
        while(opc!=3){
         opc = Integer.parseInt(JOptionPane.showInputDialog(""
              + "XYZ Tecnologia"
              + "\n1 - Cadastrar Curso"
              + "\n2 - Exibir Curso"
              + "\n3 - Sair"));
                
            switch(opc){
                case 1:curso.cadastrarCurso();
                break;
                case 2:curso.exibirCurso();
                break;
                case 3:JOptionPane.showMessageDialog(null, "Saindo do sistema");
                break;
                default:JOptionPane.showMessageDialog(null, "As opções são somente de 1 a 3");
            }
        }
    }
}
