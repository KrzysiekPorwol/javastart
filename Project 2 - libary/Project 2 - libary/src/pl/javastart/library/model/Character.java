package pl.javastart.library.model;

public class Character {

  private String name;
  private double damage;
  private double defense;
  private double hp;

  public Character(String name, double damage, double defense, double hp) {
    this.name = name;
    this.damage = damage;
    this.defense = defense;
    this.hp = hp;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public double getDamage() {
    return damage;
  }

  public void setDamage(double damage) {
    this.damage = damage;
  }

  public double getDefense() {
    return defense;
  }

  public void setDefense(double defense) {
    this.defense = defense;
  }

  public double getHp() {
    return hp;
  }

  public void setHp(double hp) {
    this.hp = hp;
  }
}
