package iniciante;

import java.util.Locale;
import java.util.Scanner;

public class Bee1017 {
    // Gasto de combustível
    /*
    * Joaozinho quer calcular e mostrar a quantidade de litros de combustível gastos em uma viagem, ao utilizar um automóvel que faz 12 KM/L.
    * Para isso, ele gostaria que você o auxiliasse através de um simples programa.
    * Para efetuar o cálculo, deve-se fornecer o tempo gasto na viagem (em horas) e a velocidade média durante a mesma (em km/h).
    * Assim, pode-se obter distância percorrida e, em seguida, calcular quantos litros seriam necessários. Mostre o valor com 3 casas decimais após o ponto.
    * Entradas: O arquivo de entrada contém dois inteiros. O primeiro é o tempo gasto na viagem (em horas) e o segundo é a velocidade média durante a mesma (em km/h).
    * Saída: Imprima a quantidade de litros necessária para realizar a viagem, com três dígitos após o ponto decimal
     * */

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        int tempoGasto = scanner.nextInt();
        int velocidadeMedia = scanner.nextInt();

        double distanciaPercorrida = tempoGasto * velocidadeMedia;
        double quantidadeLitros = distanciaPercorrida / 12;

        System.out.printf("%.3f\n", quantidadeLitros);

        scanner.close();
    }
}
