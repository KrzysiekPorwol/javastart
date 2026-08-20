package pl.javastart.library.model;

public class TextArray {

  Text[] texts = new Text[2];
  int size = 0;


  public void add(Text text) {
    texts[size] = text;
    size++;
  }

  public Text[] getTexts() {
    return texts;
  }
}
