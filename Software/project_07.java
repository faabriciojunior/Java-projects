/* Desenvolva um programa que leia o valor de um produto X e leia também a
quantidade em reais de um cofrinho no seguinte formato:
• N moedas de 1 real;
• N moedas de 50 centavos;
• N moedas de 25 centavos;
• N moedas de 10 centavos;
• N moedas de 5 centavos;
• N moedas de 1 centavos
O programa deverá verificar se o total de reais que contem no cofrinho é o
bastante para compra o produto
X. */

package Software;

import java.util.Scanner;

public class project_07 {

    public static void main(String[] args) {
    double produto;
    Scanner sc = new Scanner(System.in);
        System.out.println("Digite o valor do produto: R$");
        produto = sc.nextDouble();
        double real = 86, centavo50 = 64, centavo25 = 74, centavo10 = 84, centavo5 = 99, centavo1 = 15;
        System.out.println();
        System.out.println("86 moedas de 1 real");
        System.out.println("64 moedas de 50 centavos");
        System.out.println("74 moedas de 25 centavos");
        System.out.println("84 moedas de 10 centavos");
        System.out.println("99 moedas de 5 centavos");
        System.out.println("15 moedas de 1 centavos");
        double total = (real * 1) + (centavo50 * 0.50) + (centavo25 * 0.25)
                + (centavo10 * 0.10) + (centavo5 * 0.05) + (centavo1 * 0.01);
        System.out.println();
        System.out.println("Total: R$" + total);
        if (total >= produto) {
            System.out.println("Consegue comprar!");
        }
        else {
            System.out.println("Não consegue comprar!");
        }
    }
}
