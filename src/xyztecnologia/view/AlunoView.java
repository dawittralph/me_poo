/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package xyztecnologia.view;

import xyztecnologia.model.Aluno;
import com.google.gson.Gson;
import java.util.ArrayList;
import java.lang.reflect.Type;
import com.google.gson.reflect.TypeToken;
import java.io.PrintStream;
import java.util.List;
import javax.swing.JOptionPane;
import xyztecnologia.model.BancoDeDados;

/**
 *
 * @author dawittralph
 */
public class AlunoView {
    public Aluno al;
    Gson gson = new Gson();
    
    public void cadastrarAluno(){
      al = new Aluno();
      al.cadastrarAluno();
      int opc = Integer.parseInt(JOptionPane.showInputDialog("Deseja salvar? 1 = sim, 2 = não"));
      if(opc == 1){
          String alunoLista = gson.toJson(al);
          BancoDeDados.escreverAluno(alunoLista, "alunos.txt");
          JOptionPane.showMessageDialog(null, "Os dados do aluno foram salvos com sucesso!");
      } else if(opc == 2){
          
      } else if(opc>2){
          
      }
   }
    
   public void listarAluno(){ 
       al = new Aluno();
       List<Aluno> alns = new ArrayList<Aluno>();
       Type tipo = new TypeToken<List<Aluno>>() {}.getType();
        for (String s : BancoDeDados.lerArquivo("alunos.txt")) {
            al = gson.fromJson(s, Aluno.class);
            alns.add(al);
        }
      for(Aluno a: alns){
           a.exibirAluno();
      }
   }
   
   private Iterable<String> ReadFile(String alunostxt) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
