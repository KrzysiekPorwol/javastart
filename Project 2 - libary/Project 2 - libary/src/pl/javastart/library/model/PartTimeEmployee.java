package pl.javastart.library.model;

import pl.javastart.library.interfaces.Remuneration;

public class PartTimeEmployee extends Employee implements Remuneration {

  private double hourSalary;
  private double hourTimeWorkInMonth;

  public PartTimeEmployee(String firstName, String lastName, double hourSalary, double hourTimeWorkInMonth) {
    super(firstName, lastName);
    this.hourSalary = hourSalary;
    this.hourTimeWorkInMonth = hourTimeWorkInMonth;
  }

  public double getHourSalary() {
    return hourSalary;
  }

  public void setHourSalary(double hourSalary) {
    this.hourSalary = hourSalary;
  }

  public double getHourTimeWorkInMonth() {
    return hourTimeWorkInMonth;
  }

  public void setHourTimeWorkInMonth(double hourTimeWorkInMonth) {
    this.hourTimeWorkInMonth = hourTimeWorkInMonth;
  }

  @Override
  public String toString() {
    return super.toString() + " hourSalary=" + hourSalary + ", hourTimeWorkInMonth=" + hourTimeWorkInMonth;
  }

  @Override
  public double monthlySalary() {
    return hourSalary * hourTimeWorkInMonth;
  }

  @Override
  public double annualSalary() {
    return (hourSalary * hourTimeWorkInMonth) * 12;
  }
}
