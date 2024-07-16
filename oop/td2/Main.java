import myPackage.Staff;
import myPackage.Student;

public class Main {
  public static void main(String[] args) {
    Student student = new Student("youssef", "adress", "mip", 2024, 12.7d);
    Staff staff = new Staff("staff name", "staff adress", "taff school", 123.098d);

    System.out.println(student.getName());
    System.out.println("the staff school is : " + staff.getSchool());
    student.getName();
  }
}
