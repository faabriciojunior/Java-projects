/* Criar um programa que calcule a média final das notas de um aluno. O
programa deve ler as notas dos 4 bimestres e o número de faltas. Em
seguida deve calcular a média aritmética das notas e imprimir umas das
seguintes mensagens.
• ‘aprovado’ para média entre 7.0 e 10.0 e número de faltas até 36;
• ‘Exame final’ - média de 4.0 a 7.0 e número de faltas até 36;
• ‘Reprovado’ - média abaixo de 4.0 ou número de faltas maior que 36; */

package Software;

public class project_15 {

    public static void main(String[] args) {
    double nota1 = 10, nota2 = 0, nota3 = 10, nota4 = 9;
    double media = (nota1 + nota2 + nota3 + nota4) / 4;
    double nmrfaltas = 35;
        if (media >= 7 && media <= 10 && nmrfaltas <= 36) {
            System.out.println("aprovado");
        } else if (media >= 4 && media <= 7 && nmrfaltas <= 36) {
            System.out.println("Exame final");
        } else if (media < 4 || nmrfaltas > 36) {
            System.out.println("Reprovado");
        }
    }
}
