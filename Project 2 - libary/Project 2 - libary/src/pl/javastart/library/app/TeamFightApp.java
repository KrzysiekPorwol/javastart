package pl.javastart.library.app;

import pl.javastart.library.model.Attacker;
import pl.javastart.library.model.Defender;
import pl.javastart.library.model.Team;

public class TeamFightApp {

  static void main() {

    Attacker attacker1 = new Attacker("Zdzichu", 100, 50, 100, 0.1);
    Attacker attacker2 = new Attacker("Woj", 100, 50, 100, 0);

    Defender defender1 = new Defender("Krysia", 100, 50, 100, 0);
    Defender defender2 = new Defender("Tank", 100, 50, 100, 0.5);

    Team team1 = new Team("Czerwoni");
    Team team2 = new Team("Niebiescy");

    team1.add(attacker1);
    team1.add(attacker2);
    team1.add(defender1);
    team2.add(defender2);
    team2.add(defender1);
    team2.add(attacker2);


    System.out.println(team1.teamInfo());

    System.out.println(team1.getInfoDamage());

    double team1hp = team1.getInfoHp();
    double team2hp = team2.getInfoHp();



    team2hp = team2hp - (team1.getInfoDamage() - team2.getInfoDefense());

    team1hp = team1hp - (team2.getInfoDamage() - team1.getInfoDefense());

    if (team1hp > team2hp) {
      System.out.println("Wygrałą druzyna: " + team1.getTeamName());
    } else if (team2hp > team1hp) {
      System.out.println("Wygrałą druzyna: " + team2.getTeamName());
    } else {
      System.out.println("Remis!");
    }

  }

}
