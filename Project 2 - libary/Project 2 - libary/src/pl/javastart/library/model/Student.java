package pl.javastart.library.model;

public class Student {
  private static int HOW_MANY_STUDENTS = 0;
  private String firstName;
  private String lastName;
  private int index;


  public Student(String firstName, String lastName, int index) {
    this.firstName = firstName;
    this.lastName = lastName;
    this.index = index;
    HOW_MANY_STUDENTS++;
  }

  public static int getHowManyStudents() {
    return HOW_MANY_STUDENTS;
  }

  public String getLastName() {
    return lastName;
  }

  public void setLastName(String lastName) {
    this.lastName = lastName;
  }

  public String getFirstName() {
    return firstName;
  }

  public void setFirstName(String firstName) {
    this.firstName = firstName;
  }

  public int getIndex() {
    return index;
  }

  public void setIndex(int index) {
    this.index = index;
  }
}
