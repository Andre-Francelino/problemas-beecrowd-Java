package iniciante;

import java.util.Locale;
import java.util.Scanner;

public class Bee1008 {
    // Salário
    /*
    * Escreva um programa que leia o número de um funcionário, seu número de horas trabalhadas,
    * o valor que recebe por hora e calcula o salário desse funcionário.
    * A seguir, mostre o número e o salário do funcionário, com duas casas decimais.
    * Entradas: O arquivo de entrada contém 2 números inteiros e 1 número com duas casas decimais, representando o número,
    * quantidade de horas trabalhadas e o valor que o funcionário recebe por hora trabalhada, respectivamente.
    * Saída: Imprima o número e o salário do funcionário, conforme exemplo fornecido, com um espaço em branco antes e depois da igualdade.
    * No caso do salário, também deve haver um espaço em branco após o $.
    * NUMBER = 25
    * SALARY = U$ 555.00
    * */

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in).useLocale(Locale.US);

        int numeroFunicionario = entrada.nextInt();
        entrada.nextLine();

        int horasTrabalhadas = entrada.nextInt();
        entrada.nextLine();

        double valorPorHora = entrada.nextDouble();

        double salario = horasTrabalhadas * valorPorHora;

        System.out.println("NUMBER = " + numeroFunicionario);
        System.out.printf("SALARY = U$ %.2f\n", salario);

        entrada.close();
    }
}
