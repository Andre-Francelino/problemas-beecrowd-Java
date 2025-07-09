package iniciante;

import java.util.Scanner;

public class Bee1013 {
    // O Maior
    /*
    * Faça um programa que leia três valores e apresente o maior dos três valores lidos seguido da mensagem “eh o maior”. Utilize a fórmula:
    * MaiorAB = (a+b+abs(a-b))/2
    * Entrada: O arquivo de entrada contém três valores inteiros.
    * Saída: Imprima o maior dos três valores seguido por um espaço e a mensagem "eh o maior".
    * */

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int a = entrada.nextInt();
        int b = entrada.nextInt();
        int c = entrada.nextInt();

        int maiorAB = (a + b + Math.abs(a - b))/2;
        int maiorABC = (maiorAB + c + Math.abs(maiorAB - c))/2;

        System.out.println(maiorABC + " eh o maior");

        entrada.close();
    }
}
