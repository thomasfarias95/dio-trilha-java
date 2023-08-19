import java.util.Locale;
import java.util.Scanner;

public class contaTerminal {
    public static void main(String[] args) throws Exception {

        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Digite seu nome: ");
        String name = scanner.next();

        System.out.println("Seu numero da conta: ");
        int number = scanner.nextInt();

        System.out.println("Qual o numero da sua Agencia? : ");
        String agency = scanner.next();

        System.out.println("Seu saldo é de: ");
        float balance = scanner.nextFloat();

        System.out.printf(
                "Olá, Sr." + name + ", sua conta: " + number + ", agencia: "
                        + agency + ", com  saldo: " + balance + ", já está disponivel para saque");
    }
}

