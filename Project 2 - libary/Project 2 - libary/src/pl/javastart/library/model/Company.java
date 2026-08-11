package pl.javastart.library.model;

public class Company {
  private String name;
  private Employee[] employees;
  private int size;

  public Company(String name, int maxEmployees) {
    this.name = name;
    this.employees = new Employee[maxEmployees];
    this.size = 0;
  }

  public void addEmployee(Employee employee) {
    if (size >= employees.length) {
      System.out.println("Brak miejsca w firmie!");
      return;
    }
    employees[size] = employee;
    size++;
  }

  public void showEmployeesInfo() {

    for (int i = 0; i < size; i++ ) {
      System.out.println(employees[i].toString()
            + " koszt miesięczny: " + employees[i].monthlySalary()
            + " koszt roczny: " + employees[i].annualSalary());
    }
  }

  public void showEmployeesFullSalary() {
    double salaryMonth = 0;
    double salaryYear = 0;

    for (int i = 0; i < size; i++ ) {

      salaryMonth = salaryMonth + employees[i].monthlySalary();
      salaryYear = salaryYear + employees[i].annualSalary();

    }
    System.out.println("Suma kosztów miesiecznych: " + salaryMonth + " Suma kosztów rocznych: " + salaryYear);
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public Employee[] getEmployees() {
    return employees;
  }

  public void setEmployees(Employee[] employees) {
    this.employees = employees;
  }

  public int getSize() {
    return size;
  }

  public void setSize(int size) {
    this.size = size;
  }


}
