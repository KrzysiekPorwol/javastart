package pl.javastart.library.model;

import java.util.Objects;
import java.util.stream.Stream;

public class Score {
  private String firstTeam;
  private String secondTeam;
  private int firstTeamGoals;
  private int secondTeamGoals;

  public Score(String firstTeam, String secondTeam, int firstTeamGoals, int secondTeamGoals) {
    this.firstTeam = firstTeam;
    this.secondTeam = secondTeam;
    this.firstTeamGoals = firstTeamGoals;
    this.secondTeamGoals = secondTeamGoals;
  }

  public String getFirstTeam() {
    return firstTeam;
  }

  public void setFirstTeam(String firstTeam) {
    this.firstTeam = firstTeam;
  }

  public int getFirstTeamGoals() {
    return firstTeamGoals;
  }

  public void setFirstTeamGoals(int firstTeamGoals) {
    this.firstTeamGoals = firstTeamGoals;
  }

  public String getSecondTeam() {
    return secondTeam;
  }

  public void setSecondTeam(String secondTeam) {
    this.secondTeam = secondTeam;
  }

  public int getSecondTeamGoals() {
    return secondTeamGoals;
  }

  public void setSecondTeamGoals(int secondTeamGoals) {
    this.secondTeamGoals = secondTeamGoals;
  }

  @Override
  public boolean equals(Object o) {
    if (o == null || getClass() != o.getClass()) return false;
    Score score = (Score) o;
    return firstTeamGoals == score.firstTeamGoals && secondTeamGoals == score.secondTeamGoals && Objects.equals(firstTeam, score.firstTeam) && Objects.equals(secondTeam, score.secondTeam);
  }

  @Override
  public int hashCode() {
    return Objects.hash(firstTeam, secondTeam, firstTeamGoals, secondTeamGoals);
  }


//  Drużyna gospodarzy - Drużyna gości (wynik)"
  @Override
  public String toString() {
    return firstTeam + " - " + secondTeam + " ( " + firstTeamGoals + " : " + secondTeamGoals + " ) ";
  }

  //policz ile unikalnych drużyn brało udział w rozgrywkach (niezależnie, czy jako gospodarze, czy goście),

}
