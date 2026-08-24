package pl.javastart.library.model;

public enum Priority {
  LOW(0), MODERATE(1), HIGH(2);

  private int number;

  Priority(int number) {
    this.number = number;
  }

  public int getNumber() {
    return number;
  }

}
