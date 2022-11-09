import java.util.Scanner;

public class CBBAtividadePratica6 {

  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    int[] array = new int[10];
    int maior = 0;

    System.out.print("Insira 10 numeros: ");

    for (int i = 0; i < array.length; i++) {
      array[i] = input.nextInt();
    }

    System.out.print("Array: ");
    
    for (int i = 0; i < array.length; i++) {
      System.out.print(array[i] + " ");

      if (array[i] > maior) {
        maior = array[i];
      }
    }
    System.out.println("\nMaior elemento do array: " + maior);

    input.close();
  }
}
