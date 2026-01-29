import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
    Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
    String nomeCliente;
    String agencia;
    int numeroConta;
    Float saldo;

//Recebe os dados pelo terminal
        System.out.println("Digite o seu nome");
        nomeCliente = scanner.next();
        System.out.println("Insira a sua agencia");
        agencia = scanner.next();
        System.out.println("Insira o numero da conta");
        numeroConta = scanner.nextInt();
        System.out.println("Digite o seu saldo");
        saldo = scanner.nextFloat();

//printa as informaçoes que foram passadas
        System.out.print("Ola " + nomeCliente + " obrigado por criar uma conta em nosso banco, sua agencia e "
         + agencia + " conta " + numeroConta + "\n e o seu saldo:" + saldo + "ja esta disponivel");
    }
}
