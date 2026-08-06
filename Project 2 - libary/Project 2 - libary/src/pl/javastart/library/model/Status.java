package pl.javastart.library.model;

public enum Status {
  NEW("Nowe zamówienie, nieopłacone"), PAID("Zamówienie opłacone"), SHIPPED("Zamówienie wysłane"),
  DELIVERED("Zamówienie dostarczone"), CANCELED("Zamówienie anulowane");

  private final String description;

  Status(String description) {
    this.description = description;
  }

  public String getDescription() {
    return description;
  }

  @Override
  public String toString() {
    return name() + "Status{" +
          "description='" + description + '\'' +
          '}';
  }
}
