import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Por favor, digite o número da Agência:");
        int numero = sc.nextInt();
        System.out.println("Por favor, digite o número da Agência (formato XXXX-X):");
        String agencia = sc.next();
        System.out.println("Por favor, digite o nome do cliente:");
        String nomeCliente = sc.next();
        System.out.println("Por favor, digite o saldo:");
        float saldo = sc.nextFloat();

        String mensagem = "Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco. Sua agência é " +
                agencia + ", conta " + numero + " e seu saldo " + saldo + " já está disponível para saque.";

        System.out.println(mensagem);

        sc.close();
    }
}
