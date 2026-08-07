package pl.javastart.library.model;

public enum Light {
  CZERWONE(), ZIELONE(), ZOLTE();

  public String announcement() {
    String announcement = "";
    switch (this) {
      case CZERWONE -> announcement = "Stoj!!";
      case ZIELONE -> announcement = "Jedz!!";
      case ZOLTE -> announcement = "Zwolnij, zaraz zmiana!!";
    }
    return announcement;
  }

  public Light next() {
    Light nextLight = this;
//    if (this == CZERWONE) {
//      nextLight = ZIELONE;
//    } else if (this == ZIELONE) {
//      nextLight = ZOLTE;
//    } else {
//      nextLight = CZERWONE;
//    }
//    return nextLight;

    switch (this) {
      case CZERWONE -> nextLight = ZIELONE;
      case ZIELONE -> nextLight = ZOLTE;
      case ZOLTE -> nextLight = CZERWONE;
    }
    return nextLight;
  }
}


//Zadanie 2 — Sygnalizacja świetlna (poziom: wchodzimy w switch)
//
//To zadanie ćwiczy nową rzecz, której jeszcze nie robiłeś przy enumach: switch oraz metodę, która zwraca stałą enuma.
//
//      Stwórz enum Swiatlo z trzema stałymi: CZERWONE, ZIELONE, ZOLTE.
//
//      Dodaj do enuma dwie metody:
//
//komunikat() — zwraca String z instrukcją dla kierowcy, zależnie od tego, które to światło. Użyj do tego switch po this:
//
//CZERWONE → "Stój",
//ZIELONE → "Jedź",
//ZOLTE → "Zwolnij, zaraz zmiana".
//
//nastepne() — zwraca kolejne światło w cyklu (typ zwracany to Swiatlo). Cykl działa tak:
//
//CZERWONE → następne ZIELONE,
//ZIELONE → następne ZOLTE,
//ZOLTE → następne CZERWONE.
//
//Też zrób to switchem, tyle że tu returnujesz stałą enuma, a nie String.
//
//W klasie z main:
//
//Zacznij od Swiatlo aktualne = Swiatlo.CZERWONE;.
//      Zrób pętlę, która wykona się np. 6 razy. W każdym obrocie:
//wypisz aktualne światło i jego komunikat,
//przełącz aktualne na następne (aktualne = aktualne.nastepne();).