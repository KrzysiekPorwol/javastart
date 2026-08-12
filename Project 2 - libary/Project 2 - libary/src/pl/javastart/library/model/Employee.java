package pl.javastart.library.model;

import java.io.Serial;
import java.io.Serializable;

public class Employee extends Person implements Serializable {
  @Serial
  private static final long serialVersionUID = 1L;

  private int salary;

  public Employee(String firstName, String lastName, int salary) {
    super(firstName, lastName);
    this.salary = salary;
  }

  public int getSalary() {
    return salary;
  }

  public void setSalary(int salary) {
    this.salary = salary;
  }

  @Override
  public String toString() {
    return super.toString() +
          "salary=" + salary;
  }
}
