package pl.javastart.library.model;

import java.util.HashMap;

public class Company {

  HashMap<String, Employee> employees = new HashMap<>();

  public Company() {
  }

  public HashMap<String, Employee> getCompany() {
    return employees;
  }

  public void setCompany(HashMap<String, Employee> company) {
    this.employees = company;
  }

  public void addEmployee(Employee employee) {
    String key = employee.getFirstName() + " " + employee.getLastName();
    employees.put(key, employee);
  }

  public Employee findEmployee(String firstName, String lastName) {
    return employees.get(firstName + " " + lastName);
  }
}
