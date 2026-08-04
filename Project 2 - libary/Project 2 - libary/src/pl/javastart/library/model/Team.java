package pl.javastart.library.model;

public class Team {

  private static final int MAX_CHARACTERS = 3;
  private String teamName;
  private Character[] team = new Character[MAX_CHARACTERS];
  private int characterNumber;

  public Team(String teamName) {
    this.teamName = teamName;
  }

  public void add(Character character) {
    if (characterNumber < MAX_CHARACTERS) {
      team[characterNumber] = character;
      characterNumber++;
    }
  }

  public double getInfoDamage() {
    double damage = 0;
    for (int i = 0; i < characterNumber; i++) {
      if (team[i] instanceof Attacker) {
       damage = damage + ((Attacker) team[i]).getAttackerDamage();
      } else {
        damage = damage + team[i].getDamage();
      }
    }
    return damage;
  }

  public double getInfoDefense() {
    double defense = 0;
    for (int i = 0; i < characterNumber; i++) {
      if (team[i] instanceof Defender) {
        defense = defense + ((Defender) team[i]).getDefenderDefense();
      } else {
        defense = defense + team[i].getDefense();
      }
    }
    return defense;
  }

  public double getInfoHp() {
    double hp = 0;
    for (int i = 0; i < characterNumber; i++) {
      hp = hp + team[i].getHp();
    }
    return hp;
  }



  public String teamInfo() {
    String result = "";
    for (int i = 0; i < characterNumber; i++) {
      result = result + "Nazwa: " + team[i].getName() + " Obrazenia: " + team[i].getDamage() + " Obrona: " + team[i].getDefense() + " Ilosc zycia: " + team[i].getHp() + "\n";
    }
    return result;
  }

  public Character[] getTeam() {
    return team;
  }

  public void setTeam(Character[] team) {
    this.team = team;
  }

  public String getTeamName() {
    return teamName;
  }

  public void setTeamName(String teamName) {
    this.teamName = teamName;
  }
}
