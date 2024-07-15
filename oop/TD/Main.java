public class Main {
  public static void main(String[] args) {
    Livre book1 = new Livre("Crime and Punishement", "dostoviski");
    Livre book2 = new Livre("a (L'Alchimiste) Novel by Paulo Coelho rch", "Paulo Coello");
    int nombrePages;

    book1.updateBook(12);
    book2.updateBook(14);

    System.out.println("the nombre of pages of book 1: " + book1.getPageNumber());
    System.out.println("the nombre of pages of book 2: " + book2.getPageNumber());
    System.out.println("the title of book 1: : " + book1.getTitle());

    nombrePages = book1.getPageNumber() + book2.getPageNumber();

    System.out.println("the pages total is : " + nombrePages);
  }
}
