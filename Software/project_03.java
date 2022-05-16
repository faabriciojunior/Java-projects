/* Desenvolva um programa que receba três notas, calcule e mostre a média
aritmética entre elas, caso a média aritmética seja:
• Média maior ou igual a 7 – ALUNO APROVADO
• Média menor que 7 – ALUNO REPROVADO */

package Software;

public class project_03 {

    public static void main(String[] args) {
    double nota1 = 5, nota2 = 8, nota3 = 10;
    double media = (nota1 + nota2 + nota3) / 3;
        if (media >= 7) {
            System.out.println("ALUNO APROVADO");
        } else {
            System.out.println("ALUNO REPROVADO");
        }
    }  
}
