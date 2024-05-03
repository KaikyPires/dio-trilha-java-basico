/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package dio.exercicios;

/**
 *
 * @author Kaiky Pires
 */
public class Nome_Sobrenome {

    public static void main(String[] args) {
        String nome = "Kaiky";
        String sobrenome = "Pires";
        String nomeCompleto = nomeCompleto (nome,sobrenome);
             
        System.out.println(nomeCompleto);
    }
    public static String nomeCompleto(String nome, String sobrenome){
        return nome.concat("").concat(sobrenome);
    }
}
