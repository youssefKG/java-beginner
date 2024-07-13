public class Main {
  public static void main(String[] args) {
    Person person = new Person();
    Student student = new Student();

    person.greet();
    student.study();
    student.setAge(14);

    Teacher teacher = new Teacher();
    person.greet();
    teacher.setAge(24);
    teacher.explain();
  }
}
