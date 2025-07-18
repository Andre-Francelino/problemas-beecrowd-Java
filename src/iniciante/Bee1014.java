package iniciante;

import java.util.Locale;
import java.util.Scanner;

public class Bee1014 {
    // Consumo
    /*
    * Calcule o consumo médio de um automóvel sendo fornecidos a distância total percorrida (em Km) e o total de combustível gasto (em litros).
    * Entrada: O arquivo de entrada contém dois valores: um valor inteiro X representando a distância total percorrida (em Km),
    * e um valor real Y representando o total de combustível gasto, com um dígito após o ponto decimal.
    * Saída: Apresente o valor que representa o consumo médio do automóvel com 3 casas após a vírgula, seguido da mensagem "km/l".
    * */

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in).useLocale(Locale.US);

        int distanciaTotal = entrada.nextInt();
        entrada.nextLine();

        double combustivelGasto = entrada.nextDouble();

        double consumo = distanciaTotal / combustivelGasto;

        System.out.printf("%.3f km/l\n", consumo);

        entrada.close();

    }

}
