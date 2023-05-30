public class SistemaNumeroExtenso {
    private String numero;

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String Analise() {
        switch (numero.length()) {
            case 1:// Aqui é analisado e impresso o números com uma casa decimal
                if (numero.equals("0")) {
                    System.out.println("Zero");
                } else if (numero.equals("1")) {
                    System.out.println("Um");
                } else if (numero.equals("2")) {
                    System.out.println("Dois");
                } else if (numero.equals("3")) {
                    System.out.println("Três");
                } else if (numero.equals("4")) {
                    System.out.println("Quatro");
                } else if (numero.equals("5")) {
                    System.out.println("Cinco");
                } else if (numero.equals("6")) {
                    System.out.println("Seis");
                } else if (numero.equals("7")) {
                    System.out.println("Sete");
                } else if (numero.equals("8")) {
                    System.out.println("Oito");
                } else if (numero.equals("9")) {
                    System.out.println("Nove");
                } else {
                    System.out.println("O digito não é um número ou é maior que um dezena.");
                }
                break;
            case 2:// Aqui é analisado e impresso números com duas casas decimais
                switch (numero.charAt(0)) {
                    case '1':// Aqui é analisado se o número está na casa do 10 ou seja que começam com 1
                        if (numero.equals("10")) {
                            System.out.println("Dez");
                        } else if (numero.equals("11")) {
                            System.out.println("Onze");
                        } else if (numero.equals("12")) {
                            System.out.println("Doze");
                        } else if (numero.equals("13")) {
                            System.out.println("Treze");
                        } else if (numero.equals("14")) {
                            System.out.println("Quatorze");
                        } else if (numero.equals("15")) {
                            System.out.println("Quinze");
                        } else if (numero.equals("16")) {
                            System.out.println("Dezesseis");
                        } else if (numero.equals("17")) {
                            System.out.println("Dezessete");
                        } else if (numero.equals("18")) {
                            System.out.println("Dezoito");
                        } else if (numero.equals("19")) {
                            System.out.println("Dezenove");
                        }
                        break;
                    case '2': // Aqui é analisado se o número está na casa do 20 ou seja que começam com 2
                        System.out.print("Vinte ");
                        unidadeAnalise();
                        break;
                    case '3': // Aqui é analisado se o número está na casa do 30 ou seja que começam com 3
                        System.out.print("Trinta ");
                        unidadeAnalise();
                        break;
                    case '4': // Aqui é analisado se o número está na casa do 40 ou seja que começam com 4
                        System.out.print("Quarenta ");
                        unidadeAnalise();
                        break;
                    case '5': // Aqui é analisado se o número está na casa do 50 ou seja que começam com 5
                        System.out.print("Cinquenta ");
                        unidadeAnalise();
                        break;
                    case '6': // Aqui é analisado se o número está na casa do 60 ou seja que começam com 6
                        System.out.print("Sessenta ");
                        unidadeAnalise();
                        break;
                    case '7': // Aqui é analisado se o número está na casa do 70 ou seja que começam com 7
                        System.out.print("Setenta ");
                        unidadeAnalise();
                        break;
                    case '8': // Aqui é analisado se o número está na casa do 80 ou seja que começam com 8
                        System.out.print("Oitenta ");
                        unidadeAnalise();
                        break;
                    case '9': // Aqui é analisado se o número está na casa do 90 ou seja que começam com 9
                        System.out.print("Noventa ");
                        unidadeAnalise();
                        break;
                    default:
                    System.out.println("O digito não é um número ou é maior que um dezena.");
                        break;
                }
            default:
                break;
        }
        return "";
    }

    public String unidadeAnalise() {
        String numeroUnidade = String.valueOf(numero.charAt(1));

        if (numeroUnidade.equals("1")) {
            System.out.println("e um");
        } else if (numeroUnidade.equals("2")) {
            System.out.println("e dois");
        } else if (numeroUnidade.equals("3")) {
            System.out.println("e três");
        } else if (numeroUnidade.equals("4")) {
            System.out.println("e quatro");
        } else if (numeroUnidade.equals("5")) {
            System.out.println("e cinco");
        } else if (numeroUnidade.equals("6")) {
            System.out.println("e seis");
        } else if (numeroUnidade.equals("7")) {
            System.out.println("e sete");
        } else if (numeroUnidade.equals("8")) {
            System.out.println("e oito");
        } else if (numeroUnidade.equals("9")) {
            System.out.println("e nove");
        }
        return "";
    }

}
