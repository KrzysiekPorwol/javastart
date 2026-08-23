package pl.javastart.library.model;

public enum Choice {
  EXIT(0),
  ADD(1),
  SHOW(2);

  private final int choice;

  Choice(int choice) {
    this.choice = choice;
  }

  public int getChoice() {
    return choice;
  }
}
