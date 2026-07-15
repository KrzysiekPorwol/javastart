import java.util.concurrent.ThreadLocalRandom;

public class Dice {
  int number;

  Dice() {
    rollDice();
  }

  Dice(int number) {
    this.number = number;
  }

  void rollDice() {
    number = ThreadLocalRandom.current().nextInt(1, 7);
  }

  void showDice() {
    System.out.println("Wylosowałeś lub postawiłeś kostkę z numerem: " + number);
  }

 public static void main() {
    Dice dice = new Dice();
    dice.showDice();
    dice.rollDice();
    dice.showDice();
    System.out.println("Teraz wyciagamy nowa kostke, ale nie rzucam na start jej przypadkowo, tylko klade z 5 oczkami do góry");
    Dice dice2 = new Dice(5);
    dice2.showDice();
    dice2.rollDice();
    dice2.showDice();
  }
}


/*
Napisz program, w którym zasymulujesz rzut kostką. Zacznij od zdefiniowania klasy Dice (kostka),
która będzie posiadała jedno pole typu int. Pole to będzie przechowywało wartość z zakresu od 1 do 6,
które oznacza, jaka wartość widoczna jest na górnej ścianie kostki po rzucie.

W klasie zdefiniuj dwa konstruktory:

- bezparametrowy. Po jego wywołaniu do pola klasy Dice powinna być przypisana losowa wartość z zakresu 1-6.
- pozwalający ustawić wartość na górnej ścianie kostki.
Dodatkowo w ramach klasy zdefiniuj metodę o nazwie roll, która będzie symulowała rzut kostką.
Po jej wywołaniu do pola klasy powinna być przypisana losowa wartość z zakresu 1-6.
Dodaj także drugą metodę, która wyświetli aktualny stan kostki (jaka wartość wypadła).

Przetestuj tworzenie kostki na różne sposoby oraz zasymuluj jej kilkukrotny rzut,
każdorazowo wyświetlając wypadające na kostce wartości.
*/