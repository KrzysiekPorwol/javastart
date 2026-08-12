package pl.javastart.library.logic;

import pl.javastart.library.model.Company;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class ReadFile {

  public Company readFile() {
    String fileName = "companyFile.txt";
    Company company = null;
    try (
          var fs = new FileInputStream(fileName);
          var is = new ObjectInputStream(fs);
          ) {
      company = (Company) is.readObject();
System.out.println("Wczytano dane firmy z pliku!");
    } catch (IOException e) {
      System.err.println("Błąd odczytu pliku " + fileName);
      e.printStackTrace();
    } catch (ClassNotFoundException e) {
      System.err.println("Nie znaleziono klasy do odczytu");
      e.printStackTrace();
    }
    return company;
  }

}
