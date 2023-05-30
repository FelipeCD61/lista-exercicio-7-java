public class SistemaVerificacaoCPF {
    private String cpf;

    public String getCpf() {
        return cpf;
    }
    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getCpfSeparador() {
        String cpfNumero = cpf.replace(".", "").replace("-", "");   
        return cpfNumero;
    }
    public void setCpfSeparador(String cpfSeparador) {
        this.cpfSeparador = cpfSeparador;
    }

}
