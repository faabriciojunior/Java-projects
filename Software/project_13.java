/* Um comerciante comprou um produto e quer vendê-lo com lucro de 45% se
o valor da compra for menor que 20,00; caso contrário, o lucro será de 30%.
O programa deverá receber o valor do produto e imprimir o valor da venda. */

package Software;

public class project_13 {

    public static void main(String[] args) {
    double compra = 50;
    double lucro45 = ((compra * 45) / 100) + compra;
    double lucro30 = ((compra * 45) / 100) + compra;
        if (compra < 20) {
            System.out.println("Valor da venda: R$" + lucro45);
        } else {
            System.out.println("Valor da venda: R$" + lucro30);
        }
    }
}
