/* Desenvolva um programa que receba quatro notas, sendo que cada nota só
poderá receber valores de 0 a 10, calcule e mostre a média aritmética entre
elas, caso a média aritmética seja:
• Média maior ou igual a 7 – ALUNO APROVADO
• Média maior ou igual a 5 e menor que 7 – ALUNO DE EXAME FINAL
• Média menor que 5 – ALUNO REPROVADO */

package Software;

import java.util.Scanner;

public class project_05 {

    public static void main(String[] args) {
        
        double nota1, nota2, nota3, nota4;
        
        Scanner sc = new Scanner(System.in);
            System.out.print("Digite a primeira nota: ");
                nota1 = sc.nextDouble();
            System.out.print("Digite a segunda nota: ");
                nota2 = sc.nextDouble();
            System.out.print("Digite a terceira nota: ");
                nota3 = sc.nextDouble();
            System.out.print("Digite a quarta nota: ");
                nota4 = sc.nextDouble();
            System.out.println();
            double media = (nota1 + nota2 + nota3+ nota4) / 4;
            if (nota1 >= 0 && nota1 <= 10 && nota2 >= 0 && nota2 <= 10
                    && nota3 >= 0 && nota3 <=10 && nota4 >= 0 && nota4 <= 10) {
            if (media >= 7) {
                System.out.println("ALUNO APROVADO");
            }
            else if (media >= 5 && media < 7) {
                System.out.println("ALUNO DE EXAME FINAL");
            }
            else if (media < 5) {
                System.out.println("ALUNO REPROVADO");
            }
        }
            else {
                System.out.println("Digite uma nota maior que 0 e menor que 10");
            }
            sc.close();
    }
}
