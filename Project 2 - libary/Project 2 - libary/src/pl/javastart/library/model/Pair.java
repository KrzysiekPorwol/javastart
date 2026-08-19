package pl.javastart.library.model;

public class Pair <T, V> {
 private T instancja1;
 private V instancja2;

  public Pair(T instancja1, V instacja2) {
    this.instancja1 = instancja1;
    this.instancja2 = instacja2;
  }

  public Pair() {

  }

  public T getInstancja1() {
    return instancja1;
  }

  public void setInstancja1(T instancja1) {
    this.instancja1 = instancja1;
  }

  public V getInstancja2() {
    return instancja2;
  }

  public void setInstancja2(V instancja2) {
    this.instancja2 = instancja2;
  }

  public static <T, V> void info(Pair<T, V> para) {
    System.out.print(para.getInstancja1() + " ");
    System.out.print(para.getInstancja2());
  }
}
