package myPackage;

public class Staff extends Person {
  private String school;
  private double pay;

  public Staff(String name, String adress, String school, double pay) {
    super(name, adress);
    this.school = school;
    this.pay = pay;
  }

  public String getSchool() {
    return this.school;
  }

  public void setSchool(String school) {
    this.school = school;
  }

  public double getPay(double pay) {
    return this.pay = pay;
  }

  public void setPay(double pay) {
    this.pay = pay;
  }
}
