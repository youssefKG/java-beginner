import java.util.Scanner;

public class Main {
  public static boolean isPalindrome(String s, int left, int right) {
    if (left >= right) {
      return true;
    } else if (s.charAt(left) != s.charAt(right)) {
      return false;
    }

    return isPalindrome(s, left + 1, right - 1);
  }

  public static void main(String args[]) {
    Scanner myScanner = new Scanner(System.in);
    String[] test = {
      "radar", "banana", "hannah", "pup", "nan", "lollipop", "eye", "6543456", "deed"
    };

    System.out.println(test.length);

    for (int i = 0; i < test.length; i++) {

      boolean isPali = isPalindrome(test[i], 0, test[i].length() - 1);
      System.out.println("the string " + test[i] + " is: " + isPali);
    }
  }
}
