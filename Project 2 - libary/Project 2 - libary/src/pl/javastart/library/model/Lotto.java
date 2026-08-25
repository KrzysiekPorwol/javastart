package pl.javastart.library.model;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Lotto {

  private List<Integer> numberList = new ArrayList<>(49);

  public void generate() {
    for (int i = 1; i < 50; i++) {
      numberList.add(i);
    }
    System.out.println("Wygenerowano 49 liczb. od 1 do 49.");
  }

  public void randomize() {
    Collections.shuffle(numberList);
    System.out.println("Pomieszano losowo liczby.");

  }

  public int checkResult(List<Integer> numbers) {
    int hits = 0;
    for (int i = 0; i < 6; i++) {
      if (numbers.contains(numberList.get(i))) {
        hits++;
      }
    }
    return hits;
  }

  @Override
  public String toString() {
    return "Wylosowane liczby w lotoo: " + numberList.get(0) + " " + numberList.get(1) + " " + numberList.get(2) + " " + numberList.get(3) + " " + numberList.get(4) + " " + numberList.get(5);
  }
}
