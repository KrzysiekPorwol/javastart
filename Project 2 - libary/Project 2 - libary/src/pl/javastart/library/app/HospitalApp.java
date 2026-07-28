package pl.javastart.library.app;

import pl.javastart.library.logic.Hospital;
import pl.javastart.library.model.Patient;

import java.util.Scanner;

public class HospitalApp {

  public static void main(String[] args) {

    Patient[] patient = new Patient[10];

    Hospital hospital = new Hospital();

    Scanner whatNext = new Scanner(System.in);

    int userChoice;

    System.out.println("Wybierz 0, jesli chcesz zamknąć program, wybierz 1, jeśli chcesz dodać");
    System.out.print("pacjenta do kolejki, wybierz 2, jeśli chcesz sprawdzić listę pacjentów: ");

    userChoice = whatNext.nextInt();

    while (userChoice == 0 || userChoice == 1 || userChoice == 2) {
      if (userChoice == 0) {
        System.out.println("Do widzenia!");
        break;
      } else if (userChoice == 1) {
        hospital.addPatient(patient);
        System.out.println("Wybierz 0, jesli chcesz zamknąć program, wybierz 1, jeśli chcesz dodać");
        System.out.print("pacjenta do kolejki, wybierz 2, jeśli chcesz sprawdzić listę pacjentów: ");
        userChoice = whatNext.nextInt();
      } else if (userChoice == 2) {
        hospital.showPatient(patient);
        System.out.println("Wybierz 0, jesli chcesz zamknąć program, wybierz 1, jeśli chcesz dodać");
        System.out.print("pacjenta do kolejki, wybierz 2, jeśli chcesz sprawdzić listę pacjentów: ");
        userChoice = whatNext.nextInt();
      }
    }
//    while (userChoice == 1) {
//      hospital.addPatient(patient);
//      System.out.println("Wybierz 0, jesli chcesz zamknąć program, wybierz 1, jeśli chcesz dodać");
//      System.out.print("pacjenta do kolejki, wybierz 2, jeśli chcesz sprawdzić listę pacjentów: ");
//      userChoice = whatNext.nextInt();
//    }
//    if (userChoice == 0) {
//      System.out.println("Do widzenia!");
//    }
//
//    while (userChoice == 2) {
//      hospital.showPatient(patient);
//      System.out.println("Wybierz 0, jesli chcesz zamknąć program, wybierz 1, jeśli chcesz dodać");
//      System.out.print("pacjenta do kolejki, wybierz 2, jeśli chcesz sprawdzić listę pacjentów: ");
//      userChoice = whatNext.nextInt();
//    }
  }
}
