package iniciante;

import java.util.Locale;
import java.util.Scanner;

public class Bee1009 {
    // Salário com Bônus
    /*
    * Faça um programa que leia o nome de um vendedor, o seu salário fixo e o total de vendas efetuadas por ele no mês (em dinheiro).
    * Sabendo que este vendedor ganha 15% de comissão sobre suas vendas efetuadas, informar o total a receber no final do mês, com duas casas decimais.
    * Entradas: O arquivo de entrada contém um texto (primeiro nome do vendedor) e 2 valores de dupla precisão (double) com duas casas decimais,
    * representando o salário fixo do vendedor e montante total das vendas efetuadas por este vendedor, respectivamente.
    * Saídas: Imprima o total que o funcionário deverá receber, conforme exemplo fornecido.
    * */

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in).useLocale(Locale.US);

        String nomeVendedor = sc.nextLine();
        double salarioFixo = sc.nextDouble();
        double totalVendas = sc.nextDouble();

        double recebimentoTotal = salarioFixo + totalVendas * 0.15;

        System.out.printf("TOTAL = R$ %.2f\n", recebimentoTotal);

        sc.close();
    }

}
