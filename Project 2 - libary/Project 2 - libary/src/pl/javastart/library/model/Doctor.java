package pl.javastart.library.model;

public class Doctor extends Person {
  private double bonus;

  public Doctor(String firstName, String lastName, double paycheck, double bonus) {
    super(firstName, lastName, paycheck);
    this.bonus = bonus;
  }

  public double getBonus() {
    return bonus;
  }

  public void setBonus(double bonus) {
    this.bonus = bonus;
  }

  public String getInfo() {
    return super.getInfo() + " Premia: " + bonus;
  }
}
