/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package xyztecnologia.view;

import com.google.gson.Gson;
import java.util.ArrayList;
import java.lang.reflect.Type;
import com.google.gson.reflect.TypeToken;
import java.io.PrintStream;
import java.util.List;
import javax.swing.JOptionPane;
import xyztecnologia.model.BancoDeDados;
import xyztecnologia.model.Professor;

/**
 *
 * @author dawittralph
 */
public class ProfessorView {
    public Professor pr;
    Gson gson = new Gson();
    
    public void cadastrarProfessor(){
      pr = new Professor();
      pr.cadastrarProfessor();
      int opc = Integer.parseInt(JOptionPane.showInputDialog("Deseja salvar? 1 = sim, 2 = não"));
      if(opc == 1){
          String professorLista = gson.toJson(pr);
          BancoDeDados.escreverProfessor(professorLista, "professores.txt");
          JOptionPane.showMessageDialog(null, "Os dados do professor foram salvos com sucesso!");
      } else if(opc == 2){
          
      } else if(opc>2){
          
      }
   }
    
    public Double retornaSalBruto(){
       pr = new Professor();
       Double salBruto;
       salBruto = 0.0;
       List<Professor> prfs = new ArrayList<Professor>();
       Type tipo = new TypeToken<List<Professor>>() {}.getType();
        for (String s : BancoDeDados.lerArquivo("professores.txt")) {
            pr = gson.fromJson(s, Professor.class);
            prfs.add(pr);
        }
      for(Professor p: prfs){
           salBruto = p.retornaSalarioBruto();
      }
      return salBruto;
    }
    
    public void listarProfessor(){ 
       pr = new Professor();
       List<Professor> prfs = new ArrayList<Professor>();
       Type tipo = new TypeToken<List<Professor>>() {}.getType();
        for (String s : BancoDeDados.lerArquivo("professores.txt")) {
            pr = gson.fromJson(s, Professor.class);
            prfs.add(pr);
        }
      for(Professor p: prfs){
           p.exibirProfessor();
      }
   }
    
    private Iterable<String> ReadFile(String professorestxt) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
