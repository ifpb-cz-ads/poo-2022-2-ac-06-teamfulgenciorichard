public class CBBAtividadePratica5 {

  public static void main(String[] args) {
    String[] dias = { "Segunda", "Terça", "Quarta", "Quinta", "Sexta" };

    int i = 0;
    while (i < dias.length) {
      System.out.println(dias[i]);
      i++;
    }

    i = 0;
    System.out.print("\n");

    do {
      System.out.println(dias[i]);
      i++;
    } while (i < dias.length);

    System.out.print("\n");

    for (i = 0; i < dias.length; i++) {
      System.out.println(dias[i]);
    }
  }
}
