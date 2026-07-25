package pl.javastart.library.logic;

import pl.javastart.library.model.Coin;

import java.util.Random;

public class CoinTossSimulation {

  public void coinTossSimulation(Coin coin) {
    Random random = new Random();
    int randomNumber = random.nextInt(2);
    if (randomNumber == coin.getUserNumber()) {
      if (randomNumber == coin.getRewers()) {
        System.out.println("Brawo! wylosowana strona monety to reszka!");
      } else {
        System.out.println("Brawo! wylosowana strona monety to orzeł!");
      }
    } else {
      if (randomNumber == coin.getRewers()) {
        System.out.println("Niestety nie trafiłeś! Wylosowana strona monety to reszka");
      } else {
        System.out.println("Niestety nie trafiłeś! Wylosowana strona monety to orzeł");
      }
    }
  }

}
