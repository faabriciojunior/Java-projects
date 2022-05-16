/* Desenvolva um programa que recebe dois números e efetua a adição entre eles.
Caso o valor somado seja maior que 20, este deverá ser apresentado
somando-se a ele 8; caso o valor somado seja menor ou igual a 20,
este deverá ser apresentado subtraindo-se 5. */

package Software;

public class project_11 {

    public static void main(String[] args) {
    double n1 = 15, n2 = 15;
    double n3 = n1 + n2;
    if (n3 > 20) {
        System.out.println(n3 + 8);
    } else if (n3 <= 20) {
        System.out.println(n3 - 5);
    }
  } 
}
