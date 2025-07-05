package iniciante;

import java.util.Locale;
import java.util.Scanner;

public class Bee1012 {
    // Área
    /*
       Escreva um programa que leia três valores com ponto flutuante de dupla precisão: A, B e C.
       Em seguida, calcule e mostre:
            a) a área do triângulo retângulo que tem A por base e C por altura.
            b) a área do círculo de raio C. (pi = 3.14159)
            c) a área do trapézio que tem A e B por bases e C por altura.
            d) a área do quadrado que tem lado B.
            e) a área do retângulo que tem lados A e B.

       Entradas: O arquivo de entrada contém três valores com um dígito após o ponto decimal.
       Saídas: O arquivo de saída deverá conter 5 linhas de dados. Cada linha corresponde a uma das áreas descritas acima,
       sempre com mensagem correspondente e um espaço entre os dois pontos e o valor.
       O valor calculado deve ser apresentado com 3 dígitos após o ponto decimal.

    * */

    public static void main(String[] args) {
        final double PI = 3.14159;

        Scanner sc = new Scanner(System.in).useLocale(Locale.US);

        double a = sc.nextDouble();
        double b = sc.nextDouble();
        double c = sc.nextDouble();

        double areaTriangulo = (a * c)/2;

        double areaCirculo = PI * Math.pow(c, 2);

        double areaTrapezio = ((a + b) * c)/2;

        double areaQuadrado = Math.pow(b, 2);

        double areaRetangulo = a * b;

        System.out.printf("TRIANGULO: %.3f\n", areaTriangulo);
        System.out.printf("CIRCULO: %.3f\n", areaCirculo);
        System.out.printf("TRAPEZIO: %.3f\n", areaTrapezio);
        System.out.printf("QUADRADO: %.3f\n", areaQuadrado);
        System.out.printf("RETANGULO: %.3f\n", areaRetangulo);

        sc.close();
    }

}
