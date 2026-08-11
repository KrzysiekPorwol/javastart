package pl.javastart.library.app;

import pl.javastart.library.model.Company;
import pl.javastart.library.model.FullTimeEmployee;
import pl.javastart.library.model.PartTimeEmployee;

public class EmployeeApp {

  static void main() {

    Company fabrykaCzekolady = new Company("Fabryka Czekolady", 3);

    fabrykaCzekolady.addEmployee(new FullTimeEmployee("Krzysztof", "Porwol", 4000.00));
    fabrykaCzekolady.addEmployee(new PartTimeEmployee("Zbigniew", "Porwol", 55, 160));
    fabrykaCzekolady.addEmployee(new FullTimeEmployee("Dawid", "Porwol", 1500));
//
//    employees[0] = new FullTimeEmployee("Krzysztof", "Porwol", 4000.00);
//    employees[1] = new PartTimeEmployee("Zbigniew", "Porwol", 55, 160);
//    employees[2] = new FullTimeEmployee("Dawid", "Porwol", 1500);


    fabrykaCzekolady.showEmployeesInfo();
    fabrykaCzekolady.showEmployeesFullSalary();
  }

}
