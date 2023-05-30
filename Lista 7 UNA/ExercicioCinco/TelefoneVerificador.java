import java.util.Scanner;
public class TelefoneVerificador {
    public static void main(String []args) {
        Scanner scanner = new Scanner(System.in);
        CorrigiValidaTelefone corrigiValidaTelefone = new CorrigiValidaTelefone();

        System.out.println("\n\t#### Validador e corretor de número de telefone ####");

        System.out.println("Digite um número de telefone: ");
        corrigiValidaTelefone.setNumero(scanner.next());

        corrigiValidaTelefone.validaCorrigiNumero();

        scanner.close();
    }
}
