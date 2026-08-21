package pl.javastart.library.logic;

import java.util.ArrayList;
import java.util.List;

public class Addition {

  public Integer addition(ArrayList<Integer> arrayList) {
    Integer sum = 0;
    for (int i = 0; i < arrayList.size(); i++) {
     sum = sum + arrayList.get(i);

    }
    return sum;
  }

  public void additionCollection(ArrayList<Integer> arrayList) {

    for (int i = 0; i < arrayList.size(); i++) {
     System.out.print(arrayList.get(i) + " + ");
    }
  }

}
