package iniciante;

import java.util.Scanner;

public class Bee1007 {
    // Diferença
    /*
    * Leia quatro valores inteiros A, B, C e D. A seguir, calcule e mostre a diferença do produto de
    * A e B pelo produto de C e D segundo a fórmula: DIFERENCA = (A * B - C * D).
    * Entradas: O arquivo de entrada contém 4 valores inteiros.
    * Saídas: Imprima a mensagem DIFERENCA com todas as letras maiúsculas,
    * conforme exemplo DIFERENCA = -26, com um espaço em branco antes e depois da igualdade.
    * */

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        sc.nextLine();

        int b = sc.nextInt();
        sc.nextLine();

        int c = sc.nextInt();
        sc.nextLine();

        int d = sc.nextInt();
        sc.nextLine();

        int diferenca = (a * b - c * d);

        System.out.println("DIFERENCA = " + diferenca);

        sc.close();
    }
}
