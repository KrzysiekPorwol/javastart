package pl.javastart.library.logic;

import java.util.ArrayList;

public class Addition2 {

  public Integer addition2(ArrayList<Integer> arrayList) {
    Integer sum = 0;
    for (int i = 0; i < arrayList.size(); i++) {
      sum = sum + arrayList.get(i);
    }
    return sum;
  }

  public Double average2(ArrayList<Integer> arrayList) {
    Integer sum = addition2(arrayList);
    return (double) sum / arrayList.size();
  }
}
