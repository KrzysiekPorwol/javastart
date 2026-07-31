package pl.javastart.library.model;

public class ExhaustPart extends Part {
  private boolean compliantWithEmissionStandards;

  public boolean isCompliantWithEmissionStandards() {
    return compliantWithEmissionStandards;
  }

  public void setCompliantWithEmissionStandards(boolean compliantWithEmissionStandards) {
    this.compliantWithEmissionStandards = compliantWithEmissionStandards;
  }
}
