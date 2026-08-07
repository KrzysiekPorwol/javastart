package pl.javastart.library.app;

import pl.javastart.library.model.Light;

public class LightApp {

  static void main() {

    Light actuallyLight = Light.CZERWONE;

    for (int i = 0; 6 > i; i++) {
      System.out.println(actuallyLight.announcement());
      actuallyLight = actuallyLight.next();
    }

  }
}



//
//Zacznij od Swiatlo aktualne = Swiatlo.CZERWONE;.
//      Zrób pętlę, która wykona się np. 6 razy. W każdym obrocie:
//wypisz aktualne światło i jego komunikat,
//przełącz aktualne na następne (aktualne = aktualne.nastepne();).