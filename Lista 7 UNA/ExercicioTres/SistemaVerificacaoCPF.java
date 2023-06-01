public class SistemaVerificacaoCPF {
    private String cpf;

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public void validaCPF() {
        if (cpf.length() == 14) {
            if (cpf.charAt(3) == '.' && cpf.charAt(7) == '.' && cpf.charAt(11) == '-') {
                System.out.println("\nCPF válido");
            } else {
                System.out.println("CPF inválido.");
            }
        } else {
            System.out.println("CPF inválido.");
        }
    }

}
