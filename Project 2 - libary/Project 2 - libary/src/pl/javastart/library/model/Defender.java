package pl.javastart.library.model;

public class Defender extends Character {
  private double specialDefense;

  public Defender(String name, int damage, int defense, int hp, double specialDefense) {
    super(name, damage, defense, hp);
    this.specialDefense = specialDefense;
  }

  public double getSpecialDefense() {
    return specialDefense;
  }

  public void setSpecialDefense(double specialDefense) {
    this.specialDefense = specialDefense;
  }

  public double getDefenderDefense() {
    return getDefense() * (specialDefense + 1);
  }
}
