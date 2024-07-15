public class Livre {
  private String title, author;
  private int nbPages;
  private float price;
  private boolean prixFix = false;

  public Livre(String authorName, String bookName) {
    author = authorName;
    title = bookName;
  }

  public Livre(String authorName, String bookName, int bookPages) {
    author = authorName;
    title = bookName;
    nbPages = bookPages;
  }

  public Livre(float p) {
    if (prixFix) {
      System.out.println("you  can only updte the price once ");
      return;
    }
    price = p;
    prixFix = true;
  }

  public void setPrice(float newPrice) {
    if (prixFix) {
      System.out.println("you can only update the price once ");
      return;
    }

    price = newPrice;
    prixFix = true;
  }

  public float getPrice() {
    return price;
  }

  public void afficheToi() {
    System.out.println("the book name is:  " + title);
    System.out.println("the author  name is:  " + author);
    System.out.println("the number of book pages is : " + nbPages);
    System.out.println("the book price is :" + price);
  }
}
