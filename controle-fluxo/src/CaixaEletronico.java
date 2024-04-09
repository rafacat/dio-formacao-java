import java.util.Scanner;
import java.util.Locale;

public class CaixaEletronico {

   public static void main(String[] args) {

      Scanner scanner = new Scanner(System.in).useLocale(Locale.US);


      System.out.println("Informe o saldo de sua conta: ");
      double saldo = scanner.nextDouble();

      System.out.println("Informe o valor a ser sacado: ");
      double valorSolicitado = scanner.nextDouble();

      if(valorSolicitado < saldo){
         saldo = saldo - valorSolicitado;
         System.out.println("o valor a ser sacado é R$ " + valorSolicitado);
         System.out.println("E seu saldo atual é R$ " + saldo);

      } else {
         System.out.println("Saldo insuficente");
      }


      System.out.println("Muito obrigado por utilizar nossos serviços.");

   }
}
