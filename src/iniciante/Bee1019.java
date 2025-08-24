package iniciante;

import java.util.Scanner;

public class Bee1019 {
    // Conversão de Tempo
    /*
    * Leia um valor inteiro, que é o tempo de duração em segundos de um determinado evento em uma fábrica,
    * e informe-o expresso no formato horas:minutos:segundos.
    * Entrada: O arquivo de entrada contém um valor inteiro N.
    * Saída: Imprima o tempo lido no arquivo de entrada (segundos), convertido para horas:minutos:segundos, conforme exemplo fornecido.
     * */

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int n = entrada.nextInt();

        int horas = n / 3600;
        int resto = n % 3600;
        int minutos = resto / 60;
        int segundos = resto % 60;

        System.out.println(horas + ":" + minutos + ":" + segundos);

        entrada.close();
    }
}
