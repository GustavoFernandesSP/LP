import java.util.concurrent.ThreadLocalRandom;

public class NivelamentoLaçosDeRepeticao {

    public static void main(String[] args) {

        // For no Java só muda, ao invés de int temos que passar Integer.

        for (Integer i = 1; i<= 10; i++ ){
           System.out.println("Numero: " + i);
        }

        for (Integer i = 10; i >= 0; i-- ){
            System.out.println("Numero: " + i);
        }

        // While
        Integer contador = 0;
        while(contador <= 10){
            System.out.println("Estou dentro do While e contando:" + contador);
            contador++;
        }

        // a diferença do while para o for é que usamos o for quando sabemos a quantidade todal já o while quando não sabemos.

        // exemplo de while

        Integer numeroAleatório = 1;
        while(numeroAleatório != 0){
            System.out.println(numeroAleatório);
            numeroAleatório = ThreadLocalRandom.current().nextInt(0,11);
        }
        // nesse código o while vai ser redefinido com um número aleatório.


        Integer numeroAleatorioDois;
        do {
            numeroAleatorioDois = ThreadLocalRandom.current().nextInt(0,11);
            System.out.println(numeroAleatorioDois);
        }while (numeroAleatorioDois != 0 );

        // o do{} Whilhe() ele faz depois pergunta, executa e depois pergunta.
        // uníca diferença é que o while ele pergunta antes e depois executa, já o do while ele executa primeiro o do e depois de executado ele pergunta.




    }

}
