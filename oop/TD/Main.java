public class Main {
  public static void main(String[] args) {
    Livre book = new Livre(12.02f);

    System.out.println("before");
    book.afficheToi();
    book.setPrice(10);
    System.out.println("after");
    book.afficheToi();
  }
}
