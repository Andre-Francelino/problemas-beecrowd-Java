package iniciante;

import java.util.Locale;
import java.util.Scanner;

public class Bee1021 {
    // Notas e moedas
    /*
    * Leia um valor de ponto flutuante com duas casas decimais. Este valor representa um valor monetário.
    * A seguir, calcule o menor número de notas e moedas possíveis no qual o valor pode ser decomposto.
    * As notas consideradas são de 100, 50, 20, 10, 5, 2. As moedas possíveis são de 1, 0.50, 0.25, 0.10, 0.05 e 0.01.
    * A seguir mostre a relação de notas necessárias.
    *
    * Entrada: O arquivo de entrada contém um valor de ponto flutuante N (0 ≤ N ≤ 1000000.00).
    * Saída: Imprima a quantidade mínima de notas e moedas necessárias para trocar o valor inicial, conforme exemplo fornecido.
    * Obs: Utilize ponto (.) para separar a parte decimal.
     * */


    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in).useLocale(Locale.US);

        double valor = entrada.nextDouble();

        int centavos = (int) Math.round(valor * 100);

        int[] notas = {10000, 5000, 2000, 1000, 500, 200};
        int[] moedas = {100, 50, 25, 10, 5, 1};

        System.out.println("NOTAS:");
        for (int nota : notas) {
            int quantidade = centavos / nota;
            System.out.println(quantidade + " nota(s) de R$ " + String.format("%.2f", nota / 100.0));
            centavos %= nota;
        }

        System.out.println("MOEDAS:");
        for (int moeda : moedas) {
            int quantidade = centavos / moeda;
            System.out.println(quantidade + " moeda(s) de R$ " + String.format("%.2f", moeda / 100.0));
            centavos %= moeda;
        }

        entrada.close();
    }
}
