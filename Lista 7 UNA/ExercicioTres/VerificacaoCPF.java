import java.util.Scanner;
import java.util.Arrays;

public class VerificacaoCPF {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        SistemaVerificacaoCPF sistemaVerificacaoCPF = new SistemaVerificacaoCPF();

        System.out.println("\n\t#### Verificador de CPF ####");

        System.out.print("Digite seu CPF(xxx.xxx.xxx-xx): ");
        sistemaVerificacaoCPF.setCpf(scanner.next());

        sistemaVerificacaoCPF.validaCPF();

        scanner.close();
    }
}
