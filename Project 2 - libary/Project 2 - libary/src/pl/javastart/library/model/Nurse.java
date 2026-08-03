package pl.javastart.library.model;

public class Nurse extends Person {

  private int overtime;

  public Nurse(String firstName, String lastName, double paycheck, int overtime) {
    super(firstName, lastName, paycheck);
    this.overtime = overtime;
  }

  public int getOvertime() {
    return overtime;
  }

  public void setOvertime(int overtime) {
    this.overtime = overtime;
  }

  public String getInfo() {
    return super.getInfo() + " Nadgodziny: " + overtime;
  }
}
