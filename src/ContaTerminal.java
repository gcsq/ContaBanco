import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
    Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
    String nomeCliente;
    String agencia;
    int numero;
    Float saldo;

        System.out.println("Digite o seu nome");
        nomeCliente = scanner.next();
        System.out.println("Insira a sua agencia");
        agencia = scanner.next();
        System.out.println("Insira o numero");
        numero = scanner.nextInt();
        System.out.println("Digite o seu saldo");
        saldo = scanner.nextFloat();

        System.out.print("Prazer " + nomeCliente + " a sua agencia é:" + agencia + " do numero " + numero + "\n Saldo:" + saldo);
    }
}
