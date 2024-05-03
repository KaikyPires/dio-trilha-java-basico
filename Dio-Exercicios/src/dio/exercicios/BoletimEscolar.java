/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package dio.exercicios;

import javax.swing.JOptionPane;


public class BoletimEscolar {

    public static void main(String[] args) {
        while(true){
      String input = JOptionPane.showInputDialog("Insira a nota do aluno?");
       try{
        int notaDoAluno = Integer.parseInt(input);
        
        if (notaDoAluno >= 0 && notaDoAluno <= 10) {
            if (notaDoAluno >= 6) {
                JOptionPane.showMessageDialog(null, "Aprovado");
                break;
            } else {
                JOptionPane.showMessageDialog(null, "Reprovado");
                break;
            }
        } else {
            JOptionPane.showMessageDialog(null, "Nota inserida inválida");
        }
       }
       catch(Exception IO){
            JOptionPane.showMessageDialog(null,"Entrada Invalida");
      
       }
        }
    }
    
}
  
