package pl.javastart.library.model;

import java.util.Arrays;

public class IntArray {
  int[] array = new int[20];

  public IntArray(int[] array) {
    this.array = array;
  }

  public int[] getArray() {
    return array;
  }

  public void setArray(int[] array) {
    this.array = array;
  }
}
