package pl.javastart.library.app;

import pl.javastart.library.logic.CoinTossSimulation;
import pl.javastart.library.model.Coin;

import java.util.Scanner;

public class CoinToss {
  public static void main(String[] args) {
    System.out.print("Gramy w rzut monetą. wpisz '1' jeśli chcesz wybrać orzeł, " +
          "lub wpisz '0' jeśli chcesz wybrać reszkę: ");
    Scanner input = new Scanner(System.in);

    Coin coin = new Coin();

    coin.setUserNumber(input.nextInt());

    CoinTossSimulation coinTossSimulation = new CoinTossSimulation();

    coinTossSimulation.coinTossSimulation(coin);

  }
}




//Napisz program "rzut monetą". Użytkownik powinien mieć możliwość wyboru jednej z dwóch opcji:
//
//orzeł / awers (reprezentowana przez liczbę 1)
//reszka / rewers (reprezentowana przez liczbę 0)
//Poproś użytkownika o wybór, następnie zrób symulację rzutu monetą, poprzez wylosowanie liczby 0 lub 1.
//Wyświetl użytkownikowi komunikat, czy jego wybór był trafny, czy nie. Jeżeli wybór był trafny, to
//w komunikacie uwzględnij to, czy wypadł orzeł, czy reszka.