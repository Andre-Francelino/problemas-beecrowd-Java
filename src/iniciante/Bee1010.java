package iniciante;

import java.util.Locale;
import java.util.Scanner;

public class Bee1010 {
    // Cálculo Simples
    /*
    * Neste problema, deve-se ler o código de uma peça 1, o número de peças 1, o valor unitário de cada peça 1,
    * o código de uma peça 2, o número de peças 2 e o valor unitário de cada peça 2. Após, calcule e mostre o valor a ser pago.
    * Entrada: O arquivo de entrada contém duas linhas de dados. Em cada linha haverá 3 valores, respectivamente dois inteiros e um valor com 2 casas decimais.
    * Saída: A saída deverá ser uma mensagem conforme o exemplo fornecido VALOR A PAGAR: R$ 15.50 ,
    * lembrando de deixar um espaço após os dois pontos e um espaço após o "R$". O valor deverá ser apresentado com 2 casas após o ponto.
    * */

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in).useLocale(Locale.US);

        int codigoPeca1 = entrada.nextInt();
        int quantidadePeca1 = entrada.nextInt();
        double valorUnitarioPeca1 = entrada.nextDouble();

        int codigoPeca2 = entrada.nextInt();
        int quantidadePeca2 = entrada.nextInt();
        double valorUnitarioPeca2 = entrada.nextDouble();

        double valorTotal = (quantidadePeca1 * valorUnitarioPeca1) + (quantidadePeca2 * valorUnitarioPeca2);

        System.out.printf("VALOR A PAGAR: R$ %.2f\n", valorTotal);

        entrada.close();
    }

}
