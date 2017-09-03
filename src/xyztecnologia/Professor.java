package xyztecnologia;

import javax.swing.JOptionPane;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * @author Dawitt Ralph
 */
public class Professor extends Pessoa{
    private String lattes;
    private String email;
    private String formacao;
    private String especialidade;
    private int tipo;
    private double salario;
    private double inss;
    private double irrf;
    private double salarioSemInss;
    private double salarioLiquido;
    
    public void cadastrarProfessor(){
        //Define o formato de e-mail que é aceito no sistema.
        Pattern emailp = Pattern.compile("\\b[a-z0-9._%-]+@[a-z0-9.-]+\\.[a-z]{2,4}\\b");
        super.cadastrarPessoa();
        lattes = JOptionPane.showInputDialog("Informe o lattes do professor");
        email = JOptionPane.showInputDialog("Entre com o e-mail");
        email = email.trim().toLowerCase();
        //Compara se o e-mail informado atende ao formato definido.
        Matcher emailm = emailp.matcher(email);
        while (emailm.matches() == false) {
            JOptionPane.showMessageDialog(null, "E-mail incorreto");
            email = JOptionPane.showInputDialog("Entre com o e-mail");
            email = email.trim().toLowerCase();
            emailm = emailp.matcher(email);
        }
        formacao = JOptionPane.showInputDialog("Informe a formação do professor");
        especialidade = JOptionPane.showInputDialog("Informe a especialidade do professor");
        salario = Double.parseDouble(JOptionPane.showInputDialog("Informe o salário do professor"));
        tipo = Integer.parseInt(JOptionPane.showInputDialog("Informe o tipo do professor"));
    }
    
    public void exibirProfessor(){
        JOptionPane.showMessageDialog(null, "Dados de Professor"
              + "\n" + super.exibirPessoa()
              + "\nLattes: " + lattes
              + "\nE-mail: " + email
              + "\nFormação: " + formacao
              + "\nEspecialidade: " + especialidade
              + "\nSalário Bruto: R$" + salario
              + "\nSalário Líquido: R$" + salarioLiquido
              + "\nTipo: " + tipo);
    }
    
    //Retorna o salário bruto do professor.
    public Double retornaSalarioBruto(){
        Double sal = salario;
        return sal;
    }
    
    //Calcula o salário líquido do professor.
    public void calcularSalario(int tipo) {
        if (salario <= 1556.94) {
            inss = salario / 100 * 8;
        } else if (salario > 1556.94 && salario <= 2594.92) {
            inss = salario / 100 * 9;
        } else if (salario > 2594.92 && salario <= 5189.82) {
            inss = salario / 100 * 11;
        } else if (salario > 5189.82) {
            inss = 5189.82 / 100 * 11;
        }
        salarioSemInss = salario - inss;
        if(salarioSemInss <= 1903.98){
            irrf=0;
        } else if(salarioSemInss >=1903.99 && salarioSemInss <= 2826.65){
            irrf = (salarioSemInss - 1903.99)/100 * 7.5;
        } else if(salarioSemInss > 2826.65 && salarioSemInss <= 3751.05){
            irrf = (salarioSemInss - 1903.99)/100 * 15;
        } else if(salarioSemInss > 3751.05 && salarioSemInss <= 4664.68){
            irrf = (salarioSemInss - 1903.99)/100 * 22.5;
        } else if(salarioSemInss > 4664.68){
            irrf = (salarioSemInss - 1903.99)/100 * 27.5;
        }
        salarioLiquido = salarioSemInss - irrf;
    }
    
    //Retorna o salário líquido do professor.
    public Double retornaSalarioLiquido(){
        Double sal = salarioLiquido;
        return sal;
    }
}
