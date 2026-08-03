package pl.javastart.library.model;

public class Person {
  private String firstName;
  private String lastName;
  private double paycheck;

  public Person(String firstName, String lastName, double paycheck) {
    this.firstName = firstName;
    this.lastName = lastName;
    this.paycheck = paycheck;
  }

  public String getFirstName() {
    return firstName;
  }

  public void setFirstName(String firstName) {
    this.firstName = firstName;
  }

  public String getLastName() {
    return lastName;
  }

  public void setLastName(String lastName) {
    this.lastName = lastName;
  }

  public double getPaycheck() {
    return paycheck;
  }

  public void setPaycheck(double paycheck) {
    this.paycheck = paycheck;
  }

  public String getInfo() {
    return "Imię: " + firstName + " Nazwisko: " + lastName + " Zarobek: " + paycheck;
  }
}
