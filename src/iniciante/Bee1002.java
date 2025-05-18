package iniciante;

import java.util.Locale;
import java.util.Scanner;

public class Bee1002 {
    //Área do Círculo
    /*
    * A fórmula para calcular a área de uma circunferência é: area = π x raio2. Considerando para este problema que π = 3.14159:
    * Efetue o cálculo da área, elevando o valor de raio ao quadrado e multiplicando por π.
    * Entrada: A entrada contém um valor de ponto flutuante (dupla precisão), no caso, a variável raio.
    * Saída: Apresentar a mensagem "A=" seguido pelo valor da variável area, conforme exemplo abaixo, com 4 casas após o ponto decimal.
    * Utilize variáveis de dupla precisão (double).
    * Como todos os problemas, não esqueça de imprimir o fim de linha após o resultado, caso contrário, você receberá "Presentation Error".
    */

    public static void main(String[] args) {
        final double PI = 3.14159;

        // ajustando o useLocale para o padrão americano (US) de separador de casas decimais por ponto (.)
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
        double raio = scanner.nextDouble();

        double area = PI * Math.pow(raio, 2);

        // usando printf para fazer formatação das 4 casas decimais conforme é proposto para a saída do exercício, enquanto o %n faz a quebra de linha
        System.out.printf("A=%.4f%n", area);

        scanner.close();
    }

}
