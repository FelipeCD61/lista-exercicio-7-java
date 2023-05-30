public class CorrigiValidaTelefone {
    private String numero;

    public String getNumero() {
        return numero;
    }
    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String validaCorrigiNumero() {
        String numeroCorte = numero.replace("-", "");
        String[] numeroParts = numero.split("-");
        String numeroPart1 = numeroParts[0];
        String numeroPart2 = numeroParts[1];
        if (numeroCorte.length() == 8) {
            System.out.println("Telefone possui 8 dígitos.");
            System.out.println("Vou acrescentar o digito nove na frente.");
            System.out.println("Telefone corrigido sem formatação: 9" + numeroCorte);
            System.out.println("Telefone corrigido com formatação: 9" + numeroPart1 + "-" + numeroPart2);
        } else if (numeroCorte.length() == 9) {
            System.out.println("Telefone possui 9 dígitos.");  
            System.out.println("Telefone sem formatação: " + numeroCorte);
            System.out.println("Telefone com formatação: " + numeroPart1 + "-" + numeroPart2);  
        } else {
            System.out.println("Digito inválido");   
        }
        return "";
    }
}
