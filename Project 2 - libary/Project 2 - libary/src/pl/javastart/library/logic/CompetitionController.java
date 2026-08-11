package pl.javastart.library.logic;

import pl.javastart.library.exception.AgeViolationException;
import pl.javastart.library.exception.DuplicateException;
import pl.javastart.library.exception.MaxCompetitorsException;
import pl.javastart.library.model.Competition;
import pl.javastart.library.model.Participant;

import java.util.InputMismatchException;
import java.util.Scanner;

public class CompetitionController {
  private Scanner scanner = new Scanner(System.in);

  public void run() {
    Competition competition = createCompetition();
    fillParticipantsInfo(competition);
    printCompetition(competition);
  }

  private Competition createCompetition() {
    System.out.print("Podaj nazwę zawodów: ");
    String competitionName = scanner.nextLine();
    System.out.print("Podaj maksymalną liczbę uczestników: ");
    int maxParticipants = scanner.nextInt();
    System.out.print("Podaj ograniczenie wiekowe: ");
    int ageLimit = scanner.nextInt();
    scanner.nextLine();
    return new Competition(competitionName, maxParticipants, ageLimit);
  }

  private void fillParticipantsInfo(Competition competition) {
    while (competition.hasFreeSpots()) {
      System.out.println("Dodaj nowego uczestnika");
      try {
        Participant participant = createParticipant();
        competition.addParticipant(participant);
      } catch (IllegalArgumentException | AgeViolationException | MaxCompetitorsException | DuplicateException e) {
        System.out.println("Błąd: " + e.getMessage());
      } catch (InputMismatchException e) {
        System.out.println("Wiek musi być liczbą, spróbuj jeszcze raz.");
        scanner.nextLine();   // wyczyść błędny tekst z bufora Scannera
      }
    }
  }

  private Participant createParticipant() {
    System.out.print("Podaj imię: ");
    String firstName = scanner.nextLine();
    System.out.print("Podaj nazwisko: ");
    String lastName = scanner.nextLine();
    System.out.print("Podaj id (np. pesel): ");
    String id = scanner.nextLine();
    System.out.print("Podaj wiek: ");
    int age = scanner.nextInt();
    scanner.nextLine();
    return new Participant(firstName, lastName, id, age);
  }

  private void printCompetition(Competition competition) {
    System.out.println(competition.toString());
  }
}