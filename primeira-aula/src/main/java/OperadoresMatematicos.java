public class OperadoresMatematicos {

    public static void main(String[] args) {
        // no JS
        // +, -, *, /, %
        // +=, -+, ++, --
        // No java é a mesma coisa, menos o ** (Potência)

        Double numero01 = 42.0;
        Double numero02 = 2.0;

        System.out.println("\n");

        System.out.println("Soma: \n" + (numero01 + numero02) + "\n");
        // usa-se \n para quebra de linha e ele sempre tem que estar dentro das aspas "\n" como no exemplo a cima.

        System.out.println("Multiplicação: \n" + (numero01 * numero02)+ "\n");

        System.out.println("Subtração: \n" + (numero01 - numero02)+ "\n");

        System.out.println("Divisão: \n" + (numero01 / numero02)+ "\n");


        Double resultadoPotencia = Math.pow(numero01, numero02);

        System.out.println("Resultado da Potência: \n" + resultadoPotencia + "\n");
    }

}
