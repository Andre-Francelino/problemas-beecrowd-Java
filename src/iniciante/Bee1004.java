package iniciante;

import java.util.Scanner;

public class Bee1004 {
    //Produto simples
    /*
    * Leia dois valores inteiros. A seguir, calcule o produto entre estes dois valores
    * e atribua esta operação à variável PROD. A seguir mostre a variável PROD com mensagem correspondente.
    * Entrada: O arquivo de entrada contém 2 valores inteiros.
    * Saída: Imprima a mensagem "PROD" e a variável PROD conforme exemplo PROD = 27, com um espaço em branco antes e depois da igualdade.
    * Não esqueça de imprimir o fim de linha após o produto, caso contrário seu programa apresentará a mensagem: “Presentation Error”.
    * */

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int valor1 = scanner.nextInt();
        scanner.nextLine();

        int valor2 = scanner.nextInt();
        scanner.nextLine();

        int produto = valor1 * valor2;

        System.out.println("PROD = " + produto);

        scanner.close();
    }
}
