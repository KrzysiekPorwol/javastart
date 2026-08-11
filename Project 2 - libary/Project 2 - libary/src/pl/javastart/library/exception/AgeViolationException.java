package pl.javastart.library.exception;

public class AgeViolationException extends RuntimeException {
  public AgeViolationException(String message) {
    super(message);
  }
}
