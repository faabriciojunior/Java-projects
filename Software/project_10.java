/* Desenvolva um programa que receba 3 números via teclado e imprima o maior
deles. */

package Software;

public class project_10 {

    public static void main(String[] args) {
    double n1 = 30;
    double n2 = 4;
    double n3 = 5;
    if (n1 > n2 && n1 > n3) {
        System.out.println("O maior número é: " + n1);
    }
    else if (n2 > n1 && n2 > n3) {
        System.out.println("O maior número é: " + n2);
    }
    else if (n3 > n1 && n3 > n2) {
        System.out.println("O maior número é: " + n3);
    }
    else
        System.out.println("Digite um valor válido!");
    }
}
