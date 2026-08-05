package pl.javastart.library.app;

import pl.javastart.library.model.Computer;
import pl.javastart.library.model.DataStore;

public class NotebookShop {
  static void main() {

    Computer computer1 = new Computer(1000, "Nvidia");
    Computer computer2 = new Computer(2000, "Nvidiaa");
    Computer computer3 = new Computer(3000, "Nvidiaaa");
    Computer computer4 = new Computer(4000, "Nvidiaaaa");
    Computer computer5 = new Computer(5000, "Nvidiaaaaa");
    Computer computer6 = new Computer(1000, "Nvidia");
    Computer computer7 = new Computer(1000, "Nvidia");

    DataStore dataStore = new DataStore();

    dataStore.add(computer1);
    dataStore.add(computer2);
    dataStore.add(computer3);
    dataStore.add(computer4);
    dataStore.add(computer5);
    dataStore.add(computer6);
    dataStore.add(computer7);


    System.out.println(computer1.toString());

//    System.out.println(dataStore.toString());

//    System.out.println(dataStore.computersInStore());

    System.out.println(dataStore.checkAvailability(computer6));

    for (Computer c : dataStore.computersInStore()) {
      System.out.println(c);
    }






  }
}
