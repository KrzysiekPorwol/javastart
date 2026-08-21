package pl.javastart.library.app;

import pl.javastart.library.logic.Addition;
import pl.javastart.library.logic.UserInput;

import java.util.ArrayList;
import java.util.Comparator;

public class App {

  static void main() {

    UserInput userInput = new UserInput();
    Addition addition = new Addition();
    ArrayList<Integer> listaLiczb = userInput.userInput(new ArrayList<>());

    Integer suma = addition.addition(listaLiczb);

    addition.additionCollection(listaLiczb);
    System.out.print(" = " + suma);


  }

}


//Napisz program, który pozwoli zsumować dowolną ilość liczb od użytkownika. Aplikacja powinna
//przerwać wczytywanie liczb, gdy użytkownik wprowadzi polecenie "exit".
//
//Po wczytaniu liczb wyświetl je na ekranie oraz podaj wynik ich sumowania w postaci "a + b + c + ... + N = wynik".
//Do wczytywania danych napisz odpowiednią metodę rekurencyjną.