package pl.javastart.library.app;

import pl.javastart.library.model.Score;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Stream;

public class App {

  public static void main() {

    Score score1 = new Score("Anglia", "Belgia", 3, 2);
    Score score2 = new Score("Japonia", "Belgiaa", 0, 5);
    Score score3 = new Score("Francja", "Belgiaaa", 1, 7);
    Score score4 = new Score("Polska", "Belgiaaaa", 4, 1);
    Score score5 = new Score("Niemcy", "Belgiaaaaaaa", 0, 0);
    Score score6 = new Score("Hiszpania", "Belgia", 2, 0);
    Score score7 = new Score("Bułgaria", "Belgiaaaaaaaaaaaa", 4, 2);
    Score score8 = new Score("Belgia", "Belgiaaaaaaaaaaaaaaa", 1, 2);

    Stream<Score> allMatch = Stream.of(score1, score2, score3, score4, score5, score6, score7, score8);

    allMatch
          .sorted(Comparator
                .comparingInt((Score s) -> s.getFirstTeamGoals() - s.getSecondTeamGoals()).reversed())
          .forEach(System.out::println);

    Stream<Score> allMatch2 = Stream.of(score1, score2, score3, score4, score5, score6, score7, score8);

    System.out.println("Wszystkie mecze kraju Belgia: ");

    getAllMatches("Belgia", allMatch2).stream().forEach(score -> System.out.println(score.toString()));

    Stream<Score> allMatch3 = Stream.of(score1, score2, score3, score4, score5, score6, score7, score8);

    System.out.println(howManyTeams(allMatch3));

    Stream<Score> allMatch4 = Stream.of(score1, score2, score3, score4, score5, score6, score7, score8);

    System.out.println(howManyGoals(allMatch4));






  }

  public static List<Score> getAllMatches(String team, Stream<Score> allMatch) {
    return allMatch
          .filter(score -> team.equals(score.getFirstTeam()) || team.equals(score.getSecondTeam()))
          .toList();
  }

  public static long howManyTeams(Stream<Score> allMatch) {
    return allMatch.flatMap(score -> Stream.of(score.getFirstTeam(), score.getSecondTeam())).distinct().count();
  }

  public static long howManyGoals(Stream<Score> allMatch) {
   return allMatch.flatMap(score -> Stream.of(score.getFirstTeamGoals(), score.getSecondTeamGoals())).reduce(0, (goals, goals2) -> goals+goals2);
  }
}


//wyświetl wszystkie wyniki w konsoli w postaci "Drużyna gospodarzy - Drużyna gości (wynik)", np. "Polska - Irlandia (2:0)".
//Wyniki powinny być posortowane, na początku powinny znaleźć się te z najwyższą wygraną gospodarzy, a na końcu z
//najwyższą wygraną gości. Przykładowo na początku będą mecze z wynikiem typu 3:0, w środku remisy, a na końcu
//wyniki typu 0:3,
//
//stwórz metodę, która zwróci listę z wynikami wszystkich meczów, w których brała udział drużyna o
//wskazanej nazwie,
//
//policz ile unikalnych drużyn brało udział w rozgrywkach (niezależnie, czy jako gospodarze, czy goście),
//
//policz ile w sumie bramek zdobyto we wszystkich meczach.