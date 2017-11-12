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
import xyztecnologia.model.Curso;


/**
 *
 * @author dawittralph
 */
public class CursoView {
    public Curso cr;
    Gson gson = new Gson();
    
    public void cadastrarCurso(){
      cr = new Curso();
      cr.cadastrarCurso();
      int opc = Integer.parseInt(JOptionPane.showInputDialog("Deseja salvar? 1 = sim, 2 = não"));
      if(opc == 1){
          String cursoLista = gson.toJson(cr);
          BancoDeDados.escreverCurso(cursoLista, "cursos.txt");
          JOptionPane.showMessageDialog(null, "Os dados do curso foram salvos com sucesso!");
      } else if(opc == 2){
          
      } else if(opc>2){
          
      }
   }
    
    public void listarCurso(){ 
       cr = new Curso();
       List<Curso> crs = new ArrayList<Curso>();
       Type tipo = new TypeToken<List<Curso>>() {}.getType();
        for (String s : BancoDeDados.lerArquivo("cursos.txt")) {
            cr = gson.fromJson(s, Curso.class);
            crs.add(cr);
        }
      for(Curso c: crs){
           c.exibirCurso();
      }
   }
    
   public Double retornaValor(){
       Double valor;
       valor = 0.0;
       cr = new Curso();
       List<Curso> crs = new ArrayList<Curso>();
       Type tipo = new TypeToken<List<Curso>>() {}.getType();
        for (String s : BancoDeDados.lerArquivo("cursos.txt")) {
            cr = gson.fromJson(s, Curso.class);
            crs.add(cr);
        }
      for(Curso c: crs){
           valor = c.retornaValor();
      }
      return valor;
   }
    
    private Iterable<String> ReadFile(String cursostxt) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
