import myPackage.Student;

public class Main {
  public static void main(String[] args) {
    Student student = new Student("youssef", "adress", "mip", 2024, 12.7d);
    System.out.println(student.getName());
    student.getName();
  }
}
