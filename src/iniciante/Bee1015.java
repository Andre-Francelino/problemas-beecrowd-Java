package iniciante;

import java.util.Locale;
import java.util.Scanner;

public class Bee1015 {
    // Distância Entre Dois Pontos
    /*
    * Leia os quatro valores correspondentes aos eixos x e y de dois pontos quaisquer no plano, p1(x1,y1) e p2(x2,y2)
    * e calcule a distância entre eles, mostrando 4 casas decimais, segundo a fórmula: distancia = raiz quadrada de (x2 - x1)² + (y2 - y1)²
    *
    * Entradas: O arquivo de entrada contém duas linhas de dados.
    * A primeira linha contém dois valores de ponto flutuante x1 e y1, e a segunda linha contém dois valores de ponto flutuante x2 e y2.
    *
    * Saída: Calcule e imprima o valor da distância segundo a fórmula fornecida, considerando 4 casas decimais.
    *
    * */

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in).useLocale(Locale.US);

        double x1 = sc.nextDouble();
        double y1 = sc.nextDouble();
        double x2 = sc.nextDouble();
        double y2 = sc.nextDouble();

        double distancia = Math.sqrt(Math.pow(x2-x1,2) + Math.pow(y2-y1,2));

        System.out.printf("%.4f\n", distancia);

        sc.close();

    }
}
