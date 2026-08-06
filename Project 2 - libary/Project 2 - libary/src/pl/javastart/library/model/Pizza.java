package pl.javastart.library.model;

public enum Pizza {
  MARGHERITA("Pomidorowy", "ser", "", ""),
  CAPRICIOSA("Pomidorowy", "ser", "Pieczarki", ""),
  PROSCIUTTO("Pomidorowy", "ser", "", "Szynka");
  private final String sos;
  private final String cheese;
  private final String champignons;
  private final String ham;

  Pizza(String sos, String cheese, String champignons, String ham) {
    this.sos = sos;
    this.cheese = cheese;
    this.champignons = champignons;
    this.ham = ham;
  }

  public String getSos() {
    return sos;
  }

  public String getCheese() {
    return cheese;
  }

  public String getChampignons() {
    return champignons;
  }

  public String getHam() {
    return ham;
  }

  @Override
  public String toString() {
    return name() + " { sos= " + sos + ", cheese= " + cheese
          + ", champignons= " + champignons + ", ham= " + ham +'}' + '\'';
  }
}
