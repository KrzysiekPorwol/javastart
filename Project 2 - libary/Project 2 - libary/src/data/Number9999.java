package data;

import java.util.Random;

public class Number9999 {
  private final int number9999;

  public Number9999() {
    Random random = new Random();
    number9999 = random.nextInt(10000);
  }

  public int getNumber9999() {
    return number9999;
  }
}
