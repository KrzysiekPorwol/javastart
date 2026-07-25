package pl.javastart.library.model;

public class Coin {
  private final int awers = 1;
  private final int rewers = 0;
  private int userNumber;

  public int getAwers() {
    return awers;
  }

  public int getRewers() {
    return rewers;
  }

  public int getUserNumber() {
    return userNumber;
  }

  public void setUserNumber(int userNumber) {
    this.userNumber = userNumber;
  }
}
