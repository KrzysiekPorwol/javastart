package pl.javastart.library.model;

public class Tire extends Part {
  private int width;
  private int size;

  public Tire(int idNumber, String producer, String model,int series, int width, int size) {
    setIdNumber(idNumber);
    setProducer(producer);
    setModel(model);
    setSeries(series);
    this.size = size;
    this.width = width;
  }

  public int getWidth() {
    return width;
  }

  public void setWidth(int width) {
    this.width = width;
  }

  public int getSize() {
    return size;
  }

  public void setSize(int size) {
    this.size = size;
  }
}
