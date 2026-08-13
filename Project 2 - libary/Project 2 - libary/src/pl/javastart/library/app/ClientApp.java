package pl.javastart.library.app;

import pl.javastart.library.logic.ClientReadFile;
import pl.javastart.library.logic.ReadingCountry;
import pl.javastart.library.model.AllClients;

public class ClientApp {

  static void main() {
    ClientReadFile readFile = new ClientReadFile();

    AllClients allClients = readFile.readFile();

    allClients.FilteringBigValueCustomer();

    allClients.FilteringAllCountries(ReadingCountry.readingCountry());





  }

}
