package pl.javastart.library.app;

import pl.javastart.library.logic.CompetitionController;

public class CompetitionApp {
  public static void main(String[] args) {
    CompetitionController competitionController = new CompetitionController();
    competitionController.run();
  }
}