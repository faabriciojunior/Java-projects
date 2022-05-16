/* Desenvolva um programa que receba quatro notas, sendo que cada nota só
poderá receber valores de 0 a 10, calcule e mostre a média ponderada,
sabendo que o usuário irá entrar com o peso de cada nota, caso a
média ponderada seja:
• Média maior ou igual a 7 – ALUNO APROVADO
• Média maior ou igual a 5 e menor que 7 – ALUNO DE EXAME FINAL
• Média menor que 5 – ALUNO REPROVADO */

package Software;

import java.util.Scanner;

public class project_06 {

    public static void main(String[] args) {
    
        double nota1, nota2, nota3, nota4, peso1, peso2, peso3, peso4;
        Scanner sc = new Scanner(System.in);
            System.out.print("Digite a primeira nota e seu peso: ");
                nota1 = sc.nextDouble();
            System.out.print("Peso: ");
                peso1 = sc.nextDouble();
            System.out.print("Digite a segunda nota e seu peso: ");
                nota2 = sc.nextDouble();
            System.out.print("Peso: ");
                peso2 = sc.nextDouble();
            System.out.print("Digite a terceira nota e seu peso: ");
                nota3 = sc.nextDouble();
            System.out.print("Peso: ");
                peso3 = sc.nextDouble();
            System.out.print("Digite a quarta nota e seu peso: ");
                nota4 = sc.nextDouble();
            System.out.print("Peso: ");
                peso4 = sc.nextDouble();
            double media = ((nota1 * peso1) + (nota2 * peso2) + (nota3 + peso3) + (nota4 * peso4))
                    / (peso1 + peso2 + peso3 + peso4);
            if (nota1 >= 0 && nota1 <= 10 && nota2 >= 0 && nota2 <= 10
                    && nota3 >= 0 && nota3 <= 10 && nota4 >= 0 && nota4 <= 10) {
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
