package pl.javastart.library.exception;

import java.util.concurrent.TimeoutException;

public class UnknownOperatorException extends RuntimeException {
  public UnknownOperatorException(String message) {
    super(message);
  }
}
