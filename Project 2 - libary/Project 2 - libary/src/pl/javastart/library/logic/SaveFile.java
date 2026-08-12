package pl.javastart.library.logic;

import pl.javastart.library.model.Company;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class SaveFile {

  public void saveInFile(Company company) {
    String fileName = "companyFile.txt";
    try (
          var fs = new FileOutputStream(fileName);
          var os = new ObjectOutputStream(fs);
    ) {
      os.writeObject(company);
      System.out.println("Zapisano dane firmy do pliku");
    } catch (IOException e) {
      System.err.println("Błąd zapisu pliku " + fileName);
      e.printStackTrace();
    }
    System.out.println(company.toString());
  }
}

