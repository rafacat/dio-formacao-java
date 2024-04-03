import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {


        // Criando a classe Scanner
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);


        // Fazendo a entrada de dados
        System.out.println("Digite seu nome: ");
        String nomeCliente = scanner.next();

        System.out.println("Digite o numero da conta: ");
        int numero = scanner.nextInt();

        System.out.println("Informe a agência: ");
        String agencia = scanner.next();

        System.out.println("Informe o saldo a ser depositado: ");
        double saldo = scanner.nextDouble();


        // Imprimindo os resultados de acordo com o inserido.
        System.out.println("Olá " + nomeCliente + ", Agradecemos por criar uma conta no nosso banco. Sua agência é "
                + agencia + ", sua conta é " + numero + " O saldo de R$ " + saldo + " já está disponível para saque.");

    }
}
