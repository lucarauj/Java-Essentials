import java.util.Scanner;

import static java.lang.Math.random;

public class Repeticao {

    public static void main(String[] args) {

        //for
        for (int i = 0; i <= 10; i++) {
            System.out.println("Nessa repeticao [i] está valendo: " + i);
        }

        //while
        Scanner in = new Scanner(System.in);
        var valorDigitado = 0;
        int numero = (int)(random() * 10);

        while (valorDigitado != numero) {
            System.out.println("\nDigite um valor de 0 a 10: ");
            valorDigitado = in.nextInt();
            if (valorDigitado == numero) {
                System.out.println("Você acertou o valor, parabéns!");
            } else {
                System.out.println("Errou, tente novamente!");
            }
        }

        //do-while
        int valor = 10;
        do {
            System.out.println(valor);
            valor++;
        } while (valor <= 20);

    }
}
