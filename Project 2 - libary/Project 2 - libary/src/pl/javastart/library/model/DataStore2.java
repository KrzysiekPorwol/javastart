package pl.javastart.library.model;

public class DataStore2 {
  private final static int MAX_COMPUTERS = 100;
  private Computer2[] computers2 = new Computer2[MAX_COMPUTERS];
  private int computersInStore = 0;

  public void add(Computer2 computer2) {
    if (computersInStore == MAX_COMPUTERS) {
      System.out.println("Nie mozna dodać nowego komputera, magazyn pełny!");
    } else {
      computers2[computersInStore] = computer2;
      computersInStore++;
    }
  }

  public Computer2[] computersInStore() {
    Computer2[] result = new Computer2[computersInStore];
    if (computersInStore == 0) {
      System.out.println("Brak komputerów w magazynie");
    } else {
      for (int i = 0; i < computersInStore; i++) {
        result[i] = computers2[i];
      }
    }
    return result;
  }

  public int checkAvailability(Computer2 computer2) {
    int count = 0;
      for (int i = 0; computersInStore > i; i++) {
        if (computer2.equals(computers2[i])) {
          count++;
        }
    }
      return count;
  }
}
