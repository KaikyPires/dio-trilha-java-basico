package contabanco;

import java.util.Scanner;
public class ContaTerminal {

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        System.out.println("Por favor, digite o seu nome!");
        String nomeDoUsuario = scanner.nextLine();
        System.out.println("Por favor, digite o numero da conta!");
        int numeroDaConta = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Por favor, digite o numero da Agência!");
        String numeroDaAgencia = scanner.nextLine();
        
        double saldoDaConta = 237.48;
        
        
        System.out.println("Olá " +nomeDoUsuario+ ", obrigado por criar uma conta em nosso banco,"
                + " sua agência é " +numeroDaAgencia+ ", conta " +numeroDaConta+ " e seu " +saldoDaConta+ ""
                        + " já está disponivel para saque");
    }
    
}
