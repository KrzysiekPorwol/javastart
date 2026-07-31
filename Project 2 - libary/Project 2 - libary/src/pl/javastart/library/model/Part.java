package pl.javastart.library.model;

public class Part {
  private int idNumber;
  private String producer;
  private String model;
  private int series;

  public int getIdNumber() {
    return idNumber;
  }

  public void setIdNumber(int idNumber) {
    this.idNumber = idNumber;
  }

  public String getProducer() {
    return producer;
  }

  public void setProducer(String producer) {
    this.producer = producer;
  }

  public String getModel() {
    return model;
  }

  public void setModel(String model) {
    this.model = model;
  }

  public int getSeries() {
    return series;
  }

  public void setSeries(int series) {
    this.series = series;
  }
}
