import java.util.Scanner;
public class NumeroExtenso {
    public static void main(String []args) {
        Scanner scanner = new Scanner(System.in);
        SistemaNumeroExtenso sistemaNumeroExtenso = new SistemaNumeroExtenso();

        System.out.println("\n\t #### Número por Extenso até 99 ####");

        System.out.print("Digite um número: ");
        sistemaNumeroExtenso.setNumero(scanner.next());

        sistemaNumeroExtenso.Analise();
        
        scanner.close();
    }
}
