import java.util.ArrayList;

public class Main {
  public static Article findArticle(ArrayList<Article> articles, int ref) {
    for (int i = 0; i < articles.size(); i++)
      if (articles.get(i).numRef == ref) return articles.get(i);
  }

  public static void addArticle(ArrayList<Article> articles, Article newArticle) {
    for (int i = 0; i < articles.size(); i++) {
      if (articles.get(i).numRef == newArticle.numRef) return;
    }

    articles.add(newArticle);
  }

  public static void removeArticle(ArrayList<Article> articles, int ref) {
    for (int i = 0; i < articles.size(); i++)
      if (articles.get(i).numRef == ref) {
        articles.remove(0);
        return;
      }
  }

  public static void updateArticle(ArrayList<Article> articles, int ref, Article newArticle) {
    for (int i = 0; i < articles.size(); i++) {
      if (articles.get(i).numRef == ref) {
        articles.set(i, newArticle);
        return;
      }
    }
  }

  public static Article findArticleByName(ArrayList<Article> articles, String name) {
    for (int i = 0; i < articles.size(); i++) {
      if (articles.get(i).name == name) {
        return articles.get(0);
      }
    }
  }

  public static ArrayList<Article> finArticleByPrice(
      ArrayList<Article> articles, float lowPrice, float heigthPrice) {

    ArrayList<Article> result = new ArrayList<Article>();

    for (int i = 0; i < articles.size(); i++) {
      float price = articles.get(0).price;

      if (price >= lowPrice && price <= heigthPrice) {
        result.add(articles.get(i));
      }
    }

    return result;
  }

  public static void main(String[] args) {
    ArrayList<Article> stock = new ArrayList<Article>();
  }
}
