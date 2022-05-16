/* Desenvolva um programa que calcule a conta de luz de um cliente dado que 100
kilowatts custa 1/7 de um salário-mínimo (atribua o valor que quiser); O
programa deverá receber o gasto de um mês qualquer informado pelo
cliente e retornar o valor final da conta com 10% de desconto. */

package Software;

public class project_14 {

    public static void main(String[] args) {
    double contadeluzkilo;
    double kilow = 500;
    double salariomin = 1212;
    double porcent = 0.142857 * 100;
    contadeluzkilo = (kilow / 100) * (porcent * salariomin / 100);
    double contadeluzdescont = contadeluzkilo * 10 / 100;
    double total = contadeluzkilo - contadeluzdescont;
        System.out.printf("Valor final: R$%.2f", total);
        System.out.println();
    }
}
