package pl.javastart.library.app;

import pl.javastart.library.model.Pair;

public class TestPairApp {


  static void main() {
    Pair<String, Integer> pair1 = new Pair("Ale", 25);
    Pair<Character, String> pair2 = new Pair('B', "Alee2");
    Pair<Boolean, Integer> pair3 = new Pair(true, 5343466);

    Pair.info(pair1);
    Pair.info(pair2);
    Pair.info(pair3);


  }


}
