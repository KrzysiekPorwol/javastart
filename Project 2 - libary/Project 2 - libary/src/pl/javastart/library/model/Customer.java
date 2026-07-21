package pl.javastart.library.model;

public class Customer {

  String firstName;
  private String lastName;
  private int age;

  public Customer(String firstName, String lastName, int age) {
    this.firstName = firstName;
    this.lastName = lastName;
    this.age = age;
  }

  public String getFullName() {
    return firstName + " " + lastName;
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

  public int getAge() {
    return age;
  }

  public void setAge(int age) {
    this.age = age;
  }
}


//
//String firstName1 = "Jan";
//String lastName1 = "Kowalski";
//int age1 = 15;
//int ticket1Id = 0;
