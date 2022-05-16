/* Desenvolver um programa para recebe um número e verificar se está entre 100 e
200. Se estiver na faixa, imprimir: "Você digitou um número entre 100 e
200", senão estiver na faixa, imprimir: "Você digitou um número fora da
faixa entre100 e 200.” */

package Software;

public class project_01 {

    public static void main(String[] args) {
    double numero = 150;
        if (numero >= 100 && 200 >= numero) {
            System.out.println("Você digitou um numero entre 100 e 200");
        } else {
            System.out.println("Você digitou um numero fora da faixa entre 100 e 200");
        }
    } 
}
