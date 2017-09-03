package xyztecnologia;

import javax.swing.JOptionPane;

/**
 *
 * @author Dawitt Ralph
 */
public class XYZTecnologia {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Inicialização do Objeto Aluno
        int opc=0;
        Aluno aluno = new Aluno();
        
        while(opc!=8){
         opc = Integer.parseInt(JOptionPane.showInputDialog(""
              + "XYZ Tecnologia"
              + "\n1 - Cadastrar Escola"
              + "\n2 - Cadastrar Aluno"
              + "\n3 - Exibir Alunos"
              + "\n4 - Cadastrar Curso"
              + "\n5 - Exibir Cursos"
              + "\n6 - Cadastrar Professor"
              + "\n7 - Exibir Professor"
              + "\n8 - Sair"));
        }
        
        switch(opc){
         case 1:
         break;
         case 2 : aluno.cadastrarAluno();
         break;
         case 3 : aluno.exibirAluno();
         break;
         case 4:
         break;
         case 8: JOptionPane.showMessageDialog(null, "Saindo do sistema");
         break;
         default:JOptionPane.showMessageDialog(null, "As opções são somente de 1 a 8");
      }
    }
}
