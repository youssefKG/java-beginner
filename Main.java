public class Main {
  // public static void printName(String firstName, String lastName) {
  //   System.out.println("the firstName is : " + firstName);
  //   System.out.println("the last name is : " + lastName);
  // }
  //
  // public static void printArrayOfInt(int[] arr) {
  //   for (int i = 0; i < arr.length; i++) {
  //     System.out.println(arr[i]);
  //   }
  // }

  public static void main(String[] args) {
    // // 1- variables  and types
    String name = "yousseftaousi";
    int age = 42;
    boolean isStudent = false;
    float note = 13.5f;
    char sex = 'M';
    System.out.println("the age is " + age);
    System.out.println("the note is " + note);
    System.out.println("is student " + isStudent);
    System.out.println("the name is " + name);
    System.out.println("the sex is " + sex);
    System.out.println("hello world");
    // exercice calculate the are of recatangle
    int length = 4;
    int width = 6;
    int area;
    area = length * width;
    System.out.println("the area of rectangle is : " + area);

    // 2- Type Casting
    // Widenning Casting
    int myInt = 4;
    double myDouble = myInt;
    System.out.println(myInt);
    System.out.println(myDouble);
    // narrowing casting
    double myNum1 = 12.5523d;
    int myNum2 = (int) myNum1;
    System.out.println(myNum1);
    System.out.println(myNum2);

    // 3 String
    String txt = "youssef taoussi";
    String firstName = "youssef";
    String lastName = "taoussi";
    String fullName = firstName + lastName;
    int length = txt.length();
    String upperCaseTxt = txt.toUpperCase();
    String lowerCaseTxt = txt.toLowerCase();
    String concatFullName = firstName.concat(lastName);
    System.out.println("the upper case txt " + upperCaseTxt);
    System.out.println("the lower case txt " + lowerCaseTxt);
    System.out.println("the length is " + length);
    System.out.println("the full is : " + fullName);
    System.out.println("the cancat full Nname :" + concatFullName);

    //  4-ternary operators type variables = (condition) ? expression true : expression false
    String result = (5 > 6) ? "is correrct" : "is not correct";
    System.out.println(result); // expected is not correct

    // 5- (else if) (switch case) (do while) (for loop)  noting new

    // 6- arrays
    String[] names = {"youssef", "amine", "ahmed", "yassine", "soufaine", "adam"};
    int[] numbers = {1, 3, 5, 6, 10, 0};
    for (String name : names) {
      System.out.println(name);
    }
    for (int num : numbers) {
      System.out.println(num);
    }

    // 7  methods
    int[] arrOfInt = {1, 43, 42, 532, 31};
    printName(firstName, lastName);
    printArrayOfInt(arrOfInt);
  }
}
