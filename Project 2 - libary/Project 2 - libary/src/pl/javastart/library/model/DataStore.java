package pl.javastart.library.model;

import java.util.Arrays;

public class DataStore {
  private static final int MAX_COMPUTERS = 100;
  private int computerNumber;
  private Computer[] computers = new Computer[MAX_COMPUTERS];

  public void add(Computer computer) {
    if (computerNumber < MAX_COMPUTERS) {
      computers[computerNumber] = computer;
      computerNumber++;
    }
  }

  public Computer[] computersInStore() {
    Computer[] result = new Computer[computerNumber];
    for (int i = 0; computerNumber > i; i++) {
      result[i] = computers[i];
    }
    return result;
  }

  public int checkAvailability(Computer find) {
    if (find == null) return 0;

    int count = 0;
    for (int i = 0; i < computerNumber; i++) {
      if (find.equals(computers[i])) { // Tu działa nasze nadpisane equals!
        count++;
      }
    }
    return count;
  }
}
