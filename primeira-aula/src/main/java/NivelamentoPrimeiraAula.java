import java.util.concurrent.ThreadLocalRandom;

public class NivelamentoPrimeiraAula {

    public static void main(String[] args) {

        Integer numero01 = 10;
        Integer numero02 = 10;

        if(numero01 < numero02){
            System.out.println("Numero01 é menor que numero02");
        } else if (numero01.equals(numero02)) {
            // o .equal() ele faz a comparação se é igual. ele foi feito para texto mas é utilizado para ambos.
            System.out.println("Números iguais");
        } else{
            System.out.println("Numero02 é menor que numero01");
        }


        String nome01 = "Gustavo";
        String nome02 = "Gustavo";

        if(nome01.equals(nome02)){
            System.out.println("Nomes iguais.");
        }else{
            System.out.println("Nomes não são iguais.");
        }

        // .equals faz a comparação do valor, ele é case sensitive.
        // == faz a comparação do endereço de memória.

        // ---------------------------------------------------------------

        // Números randomicos

        Integer sorteio = ThreadLocalRandom.current().nextInt(-100,101);

        // ultilizando ThreadLocalRandom.current().nextInt() ele gera um número aleatório.
        // já o nextInt() ele aceita delimitar o número como no exemplo a cima ele vai de -100 até 100.
        // ficar atento ao utilizar nextInt() pois se eu quero que ele vai até 100 tenho que passar 101, 1 a mais.

        System.out.println("Meu Número aleatório é: "+sorteio);


        Double sorteioNumeroQuebrado = ThreadLocalRandom.current().nextDouble(0, 10.5);
        System.out.println("Meu Número aleatório em número quebrados é: "+sorteioNumeroQuebrado);


    }
}
