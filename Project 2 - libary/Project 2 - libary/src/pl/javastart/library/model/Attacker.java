package pl.javastart.library.model;

public class Attacker extends Character {
  private double specialDamage;

  public Attacker(String name, int damage, int defense, int hp, double specialDamage) {
    super(name, damage, defense, hp);
    this.specialDamage = specialDamage;
  }

  public double getSpecialDamage() {
    return specialDamage;
  }

  public void setSpecialDamage(double specialDamage) {
    this.specialDamage = specialDamage;
  }

   public double getAttackerDamage() {
     return getDamage() * (specialDamage + 1);
  }
}
