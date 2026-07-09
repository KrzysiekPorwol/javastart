diagram 2:
      ┌──────────┐
      │  Game2   │
      └──────────┘
                     ┌────────────────────┐
                     │  title = Starcraft │
      ┌──────────┐   │  rating = 8        │
      │  Game3   ├───└────────────────────┘
      └──────────┘

class Employee {
  String firstName;
  String lastName;
  int yearOfBirth;
  double seniority;
}

class Company {
  public static void main(String[] args) {
    Employee employee1 = new Employee();
    employee1.firstName = "Krzysztof";
    employee1.lastName = "Porwoł";
    employee1.yearOfBirth = 28;
    employee1.seniority = 0;

    Employee employee2 = new Employee();
    employee2.firstName = "Dawid";
    employee2.lastName = "Nowak";
    employee2.yearOfBirth = 38;
    employee2.seniority = 5;

    Employee employee3 = new Employee();
    employee3.firstName = "Marcin";
    employee3.lastName = "Kowalski";
    employee3.yearOfBirth = 48;
    employee3.seniority = 10;

    String employeeInfo1 = employee1.firstName + " " + employee1.lastName
          + ", Year of birth: " + employee1.yearOfBirth
          + ", Seniority: " + employee1.seniority + "\n";

    String employeeInfo2 = employee2.firstName + " " + employee2.lastName
          + ", Year of birth: " + employee2.yearOfBirth
          + ", Seniority: " + employee2.seniority + "\n";

    String employeeInfo3 = employee3.firstName + " " + employee3.lastName
          + ", Year of birth: " + employee3.yearOfBirth
          + ", Seniority: " + employee3.seniority + "\n";

    System.out.println(employeeInfo1 + employeeInfo2 + employeeInfo3);
  }
}

//Napisz program, w którym utworzysz dwie klasy:
//
//Employee - klasa, która będzie przedstawiała pracownika dowolnej firmy. Podstawowe informacje o pracowniku, jakie są potrzebne pracodawcy to imię, nazwisko, rok urodzenia, staż pracy,
//Company - klasa, w której utworzysz 3 obiekty reprezentujące pracowników, a następnie wyświetlisz informację o nich na ekranie.