/* Uma empresa abriu uma linha de crédito para os funcionários. O valor da
prestação não pode ultrapassar 30% do salário. Faça um programa que
receba o salário, o valor do empréstimo e o número de prestações
e informe se o empréstimo pode ser concedido. Nenhum dos valores
informados pode ser zero ou negativo. */

package Software;

public class project_12 {

    public static void main(String[] args) {
    double salario = 3000;
    double valoremprest = 889;
    double nmrprest = 1;
    double valortt = (salario * 30) / 100;
        if (salario > 0 && valoremprest > 0 && nmrprest > 0) {
        if (valoremprest <= valortt) {
            System.out.println("O empréstimo pode ser concedido");
        } else {
            System.out.println("O empréstimo não pode ser concedido");
        }
        }
        else {
            System.out.println("Digite valores acima de 0");
        }
    }
}
