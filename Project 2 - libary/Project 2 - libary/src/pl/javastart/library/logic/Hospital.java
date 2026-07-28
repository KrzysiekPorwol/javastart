package pl.javastart.library.logic;

import pl.javastart.library.model.Patient;

import java.util.Scanner;

public class Hospital {

  int list = 0;
  Scanner add = new Scanner(System.in);

  public void addPatient(Patient[] patient) {
    if (list < 10) {
      System.out.print("Jak ma na imię pacjent którego chcesz dodać do kolejki?: ");
      Patient newPatient = new Patient();
      newPatient.setFirstName(add.nextLine());
      System.out.print("Jak ma na nazwisko pacjent którego chcesz dodać do kolejki?: ");
      newPatient.setLastName(add.nextLine());
      System.out.print("Jaki ma pesel pacjent którego chcesz dodać do kolejki?: ");
      newPatient.setPesel(add.nextLine());
      patient[list] = newPatient;
      list++;
    } else {
      System.out.println("Na liscie znajduje sie juz 10 pacjentów, nie można dodać wiecej");
    }
  }

  public void showPatient(Patient[] patient) {
    for (int i = 0; i < list; i++) {
      System.out.println("Pacjent" + " " + patient[i].getFirstName() + " " + patient[i].getLastName()
            + " " + patient[i].getPesel());
    }
  }
}
