package pl.javastart.library.model;

import pl.javastart.library.exception.AgeViolationException;
import pl.javastart.library.exception.DuplicateException;
import pl.javastart.library.exception.MaxCompetitorsException;

public class Competition {
  private String name;
  private Participant[] participants;
  private int ageLimit;
  private int size;

  public Competition(String name, int maxParticipants, int ageLimit) {
    if (maxParticipants <= 0) {
      throw new IllegalArgumentException("Ilosc uczestnikow w zawodach nie moze byc ujemna lub rowna zeru!");
    }
    this.name = name;
    this.ageLimit = ageLimit;
    this.participants = new Participant[maxParticipants];
  }

  public void addParticipant(Participant participant) {
    if (size >= participants.length) {
      throw new MaxCompetitorsException("Lista zawodników jest już pełna!");
    }
    for (int i = 0; i < size; i++) {
      if (participant.getDocumentId().equals(participants[i].getDocumentId())) {
        throw new DuplicateException("Taki uczestnik już jest zapisany na zawody!");
      }

    }
    if (participant.getAge() < ageLimit) {
      throw new AgeViolationException("Wiek uczestnika jest za mały");
    }
    participants[size] = participant;
    size++;
  }

  public boolean hasFreeSpots() {
    return size < participants.length;
  }

  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder();
    builder.append("Zawody ")
          .append(name)
          .append("\n")
          .append("Liczba uczestników: ").append(size);
    for (int i = 0; i < size; i++) {
      builder.append("\n");
      builder.append(" > ");
      builder.append(participants[i].toString());
    }
    return builder.toString();
  }
}