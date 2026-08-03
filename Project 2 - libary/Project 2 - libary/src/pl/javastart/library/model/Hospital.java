package pl.javastart.library.model;

public class Hospital {

  private static final int MAX_EMPLOYEES = 3;
  Person[] employees = new Person[MAX_EMPLOYEES];
  int employeesNumber = 0;

  public void add(Person person) {
    if (employeesNumber < MAX_EMPLOYEES) {
      employees[employeesNumber] = person;
      employeesNumber++;
    }
  }

  public String getInfo() {
    String result = "";
    for (int i = 0; i < employeesNumber; i++) {
      result = result + employees[i].getInfo() + "\n";
    }
    return result;
  }
//  public String getInfo() {
//    for (int i = 0; employee.length == i; i++) {
//      return employee[i].getFirstName() + " Nazwisko: " + employee[i].getLastName() + " Wyplata: " + employee[i].getPaycheck();
//    }
//return
//  }
}
