public class Livre {
  private String title, author;
  private int nbPages;

  public Livre() {}

  public Livre(String authorName, String bookName) {
    author = authorName;
    title = bookName;
  }

  public Livre(String authorName, String bookName, int bookPages) {
    author = authorName;
    title = bookName;
    nbPages = bookPages;
  }

  public String getAuthor() {
    return author;
  }

  public String getTitle() {
    return title;
  }

  public void setNumberPages(int livrePageNumber) {
    nbPages = livrePageNumber;
  }

  public int getPageNumber() {
    return nbPages;
  }

  public void updateBook(int nb) {
    if (nb >= 0) {
      nbPages = nb;
      return;
    }
    System.out.println("you cannot add negative number ");
  }

  public void updateBook(String bookName, String authorName) {
    title = bookName;
    author = authorName;
  }

  public void afficheToi() {
    System.out.println("the book name is:  " + title);
    System.out.println("the author  name is:  " + author);
    System.out.println("the number of book pages is : " + nbPages);
  }
}
