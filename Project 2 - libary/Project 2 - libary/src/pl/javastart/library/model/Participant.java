package pl.javastart.library.model;

import pl.javastart.library.exception.AgeViolationException;

import java.util.Objects;

public class Participant {
  private String firstName;
  private String lastName;
  private String documentId; //np. pesel
  private int age;

  public Participant(String firstName, String lastName, String documentId, int age) {
    if (age < 0) {
      throw new IllegalArgumentException("Wiek nie może być ujemny!");
    }
      this.firstName = firstName;
      this.lastName = lastName;
      this.documentId = documentId;
      this.age = age;
    }

  public String getFirstName() {
    return firstName;
  }

  public void setFirstName(String firstName) {
    this.firstName = firstName;
  }

  public String getLastName() {
    return lastName;
  }

  public void setLastName(String lastName) {
    this.lastName = lastName;
  }

  public String getDocumentId() {
    return documentId;
  }

  public void setDocumentId(String documentId) {
    this.documentId = documentId;
  }

  public int getAge() {
    return age;
  }

  public void setAge(int age) {
    this.age = age;
  }

  @Override
  public String toString() {
    return firstName + " " + lastName + ", id: " + documentId + ", age: " + age;
  }

  @Override
  public boolean equals(Object o) {
    if (o == null || getClass() != o.getClass()) return false;
    Participant that = (Participant) o;
    return age == that.age && Objects.equals(firstName, that.firstName) && Objects.equals(lastName, that.lastName) && Objects.equals(documentId, that.documentId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(firstName, lastName, documentId, age);
  }
}