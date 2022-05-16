/* Desenvolva um programa que receba quatro notas, calcule e mostre a média
aritmética entre elas, caso a média aritmética seja:
• Média maior ou igual a 7 – ALUNO APROVADO
• Média maior ou igual a 5 e menor que 7 – ALUNO DE EXAME FINAL
• Média menor que 5 – ALUNO REPROVADO */ 

package Software;

public class project_04 {

    public static void main(String[] args) {
    double nota1 = 10, nota2 = 10, nota3 = 10, nota4 = 9;
    double media = (nota1 + nota2 + nota3 + nota4) / 4;
        if (media >= 7) {
            System.out.println("ALUNO APROVADO");
        } else if (media >= 5 && media < 7) {
            System.out.println("ALUNO DE EXAME FINAL");
        } else if (media < 5) {
            System.out.println("ALUNO APROVADO");
        }
    }
}
