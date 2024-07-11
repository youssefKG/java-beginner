import java.util.ArrayList;

public class ReverseString {
  public static ArrayList<Character> reverseString(ArrayList<Character> s, int left, int right) {

    if (left >= right) {
      return s;
    }
    char temp = s.get(left);
    s.set(left, s.get(right));
    s.set(right, temp);

    return reverseString(s, left + 1, right - 1);
  }

  public static void printArraList(ArrayList<Character> array) {
    for (int i = 0; i < array.size(); i++) {
      System.out.print(array.get(i));
    }
    System.out.print('\n');
  }

  public static void main(String[] args) {
    String name = "youssef taoussi";
    ArrayList<Character> arrayName = new ArrayList<Character>();

    System.out.println(arrayName.size());
    // copy the name in array name
    for (int i = 0; i < name.length(); i++) {
      arrayName.add(name.charAt(i));
    }

    printArraList(arrayName);
    //
    ArrayList<Character> reversedArrayName = reverseString(arrayName, 0, arrayName.size() - 1);
    //
    printArraList(reversedArrayName);
    //
    // System.out.println("the name is :" + name);
  }
}
