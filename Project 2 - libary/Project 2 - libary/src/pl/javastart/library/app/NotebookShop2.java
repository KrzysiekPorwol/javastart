package pl.javastart.library.app;

import pl.javastart.library.model.Computer2;
import pl.javastart.library.model.DataStore2;

public class NotebookShop2 {

  static void main() {

    Computer2 computer21 = new Computer2(1, "Geforce");
    Computer2 computer22 = new Computer2(2, "Geforcee");
    Computer2 computer23 = new Computer2(3, "Geforceee");
    Computer2 computer24 = new Computer2(4, "Geforceeee");
    Computer2 computer25 = new Computer2(1, "Geforce");

    DataStore2 dataStore2 = new DataStore2();

    dataStore2.add(computer21);
    dataStore2.add(computer22);
    dataStore2.add(computer23);
    dataStore2.add(computer24);
    dataStore2.add(computer25);

    System.out.println(computer21.toString());

    for (Computer2 c : dataStore2.computersInStore()) {
      System.out.println(c.toString());
    }

    System.out.println("Czy jest taki sam komputer w magazynie?: " + dataStore2.checkAvailability(computer21));
  }





}
