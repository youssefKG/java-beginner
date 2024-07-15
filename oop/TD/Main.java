public class Main {
  public static void main(String[] args) {
    Livre book1 = new Livre();
    Livre book2 = new Livre("author", "title");
    Livre book3 = new Livre("author 3 ", "title 3", 300);

    book1.afficheToi();
    book2.afficheToi();
    book3.afficheToi();
  }
}
