import java.util.Scanner;
import java.util.Arrays;
public class VerificacaoCPF {
    public static void main(String []args) {
        Scanner scanner = new Scanner(System.in);
        SistemaVerificacaoCPF sistemaVerificacaoCPF = new SistemaVerificacaoCPF();

        System.out.println("\n\t#### Verificador de CPF ####");

        System.out.print("Digite seu CPF(xxx.xxx.xxx-xx): ");
        sistemaVerificacaoCPF.setCpf(scanner.next());

        
        if (sistemaVerificacaoCPF.getCpf().length() == 14) {
            if (sistemaVerificacaoCPF.getCpf().charAt(3) == '.' && sistemaVerificacaoCPF.getCpf().charAt(7) == '.' && sistemaVerificacaoCPF.getCpf().charAt(11) == '-') {
                System.out.println("\nCPF válido");
            } else {
                System.out.println("CPF inválido.");
            }
        } else {
            System.out.println("CPF inválido.");
        }
               
               
        
        scanner.close();
    }
}
