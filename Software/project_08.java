/* Desenvolva um programa onde o usuário irá escolher se quer converter graus
Celsius para Fahrenheit ou Fahrenheit para Celsius. */

package Software;

import java.util.Scanner;

public class project_08 {

    public static void main(String[] args) {
    double celsius;
    double fahrenheit;
    double celsisusparafah;
    Scanner sc = new Scanner(System.in);
        System.out.print("Deseja converter Celsius para Fahrenheit(s/n)?: ");
        char resp1 = sc.nextLine().charAt(0);
        if (resp1 != 'n') {
            System.out.print("Quantos graus celsius?: ");
            celsius = sc.nextDouble();
            celsisusparafah = (celsius * 1.8) + 32;
            System.out.print("Fahrenheit: " + celsisusparafah + "°");
            System.out.println();
        } else {
            System.out.print("Deseja converter Fahreheit para Celsius(s/n)?: ");
            char resp2 = sc.nextLine().charAt(0);
            if (resp2 != 'n') {
                System.out.println("Quantos graus Fahrenheit?: ");
                fahrenheit = sc.nextDouble();
                double fahparacelsius = (fahrenheit - 32) / 1.8;
                System.out.print("Celsius: " + fahparacelsius + "°");
                System.out.println();
            }
        }
    }
}
