package pl.javastart.library.model;

import pl.javastart.library.interfaces.Remuneration;

public class FullTimeEmployee extends Employee implements Remuneration {

  private double salary;

  public FullTimeEmployee(String firstName, String lastName, double salary) {
    super(firstName, lastName);
    this.salary = salary;
  }

  public double getSalary() {
    return salary;
  }

  public void setSalary(double salary) {
    this.salary = salary;
  }

  @Override
  public String toString() {
    return super.toString() + " salary=" + salary;
  }

  @Override
  public double monthlySalary() {
    return (0.05 * salary) + salary;
  }

  @Override
  public double annualSalary() {
    double yearSalary = 12 * salary;
    return yearSalary + (0.05 * yearSalary);
  }
}
