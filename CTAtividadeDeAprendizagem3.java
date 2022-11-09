import java.util.Scanner;

public class CTAtividadeDeAprendizagem3 {

  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    int[] notas = new int[10];
    int calculo = 0, abaixo = 0, acima = 0;

    final int media = 7;

    for (int i = 0; i < notas.length; i++) {
      int aluno = i + 1;
      System.out.print("Insira a nota do aluno " + aluno + "(1-10): ");
      notas[i] = input.nextInt();

      calculo += notas[i];

      if (notas[i] < media) {
        abaixo++;
      } else if (notas[i] >= media) {
        acima++;
      }
    }

    int mediaAritmetica = calculo / notas.length;

    System.out.println("\nMedia da turma: " + mediaAritmetica);

    System.out.println(
      "\nNumero de notas acima da media: " + acima + "\nNotas: "
    );

    for (int i = 0; i < notas.length; i++) {
      if (notas[i] >= media) {
        int aluno = i + 1;
        System.out.println("Aluno " + aluno + ": " + notas[i]);
      }
    }

    System.out.println(
      "\nNumero de notas abaixo da media: " + abaixo + "\nNotas: "
    );

    for (int i = 0; i < notas.length; i++) {
      if (notas[i] < media) {
        int aluno = i + 1;
        System.out.println("Aluno " + aluno + ": " + notas[i]);
      }
    }

    input.close();
  }
}
