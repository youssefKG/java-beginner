public class Livre {
  private String title, author;
  private int nbPages;

  public Livre(String livreTitle, String livreAuthor) {
    title = livreTitle;
    author = livreAuthor;
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
}
