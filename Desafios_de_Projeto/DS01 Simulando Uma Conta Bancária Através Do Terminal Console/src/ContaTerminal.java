import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        //TODO: Mensagem de Boas Vindas
        System.out.println("*********************************************** \n SEJA BEM VINDO AO BANCO SANTANDER BOOTCAMP \n***********************************************");

        //TODO: Conhecer e importar a class Scanner
        Scanner console = new Scanner(System.in);
        System.out.println("Por favor, digite o número da Agência !");
        int agencia = Integer.parseInt(console.nextLine());

        System.out.println("Por favor, digite o número da Conta !");
        int conta = Integer.parseInt(console.nextLine());

        System.out.println("Por favor, digite o seu Nome !");
        String nome = console.nextLine();
        System.out.println("Por favor, digite o seu Saldo !");
        double saldo = console.nextDouble();  

        System.out.println("\n\nConfirme os seus dados\n\n" + "Agência: " + agencia + "\nConta: " + conta + "\nNome : " + nome + "\nSaldo : " + saldo);
        System.out.println("Confirme os seus dados preenchidos\n\n1. Confirmar\n2. Voltar");


       //TODO: Exibir mensagens para usuário

       //TODO: Obter pela class Scanner, os valores digitados no terminal

       //Todo: Exibir a mensagem final 

    }
}
