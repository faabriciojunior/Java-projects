/*Desenvolva um programa para ler um inteiro e imprimir uma mensagem caso ele
seja menor que 3 ou maior que 25. */

package Software;

public class project_02 {

    public static void main(String[] args) {
    int numero = 15;
        if (numero < 3 || numero > 25) {
            System.out.println(numero);
        } else {
            System.out.println("O numero está entre 3 e 25");
        }
    } 
}
