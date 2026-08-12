package pl.javastart.library.model;

import java.io.Serializable;
import java.util.Arrays;

public class Company implements Serializable {
  private Employee[] employees;
  private int size;

  public Company(int HowManyEmployees) {
    employees = new Employee[HowManyEmployees];
    this.size = 0;
  }

  public void addEmployee(Employee employee) {
    if (size >= employees.length) {
      System.out.println("Firma nie ma miejsca na wiecej pracowników");
    } else {
      employees[size] = employee;
      size++;
    }
  }

  public Employee[] getEmployees() {
    return employees;
  }

  public void setEmployees(Employee[] employees) {
    this.employees = employees;
  }

  @Override
  public String toString() {
    return "Company{" +
          "employees=" + Arrays.toString(employees) +
          '}';
  }
}
