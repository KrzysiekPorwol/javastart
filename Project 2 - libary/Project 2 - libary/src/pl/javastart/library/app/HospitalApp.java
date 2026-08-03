package pl.javastart.library.app;

import pl.javastart.library.model.Doctor;
import pl.javastart.library.model.Hospital;
import pl.javastart.library.model.Nurse;
import pl.javastart.library.model.Person;

public class HospitalApp {

  static void main() {

    Hospital hospital = new Hospital();

    hospital.add(new Doctor("Dawid", "Porwol", 6500.50, 900));
    hospital.add(new Nurse("Danuta", "Kuczok", 3600, 15));
    hospital.add(new Nurse("Kasia", "Kagsgas", 3650, 0));

    System.out.println("Pracownicy Szpitala: ");
    System.out.println(hospital.getInfo());
  }

}
