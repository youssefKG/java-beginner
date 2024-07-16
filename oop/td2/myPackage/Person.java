package myPackage;

public abstract class Person {
  public String name;
  public String adress;

  public Person(String name, String adress) {
    this.name = name;
    this.adress = adress;
  }

  public String getName() {
    return this.name;
  }

  public String getAdress() {
    return this.name;
  }

  public void setAdress(String adress) {
    this.adress = adress;
  }
}
