package pl.javastart.library.logic;

import java.util.ArrayList;
import java.util.Objects;
import java.util.Scanner;

public class UserInput {

    private Scanner scanner = new Scanner(System.in);   // pole, jeden na całą klasę

    public ArrayList<Integer> userInput(ArrayList<Integer> listaLiczb) {
      System.out.println("Wprowadź liczbę lub 'exit' ");
      String input = scanner.nextLine();

      if (input.equals("exit")) {
        return listaLiczb;
      }

      listaLiczb.add(Integer.parseInt(input));
      return userInput(listaLiczb);
    }
}

/*1. Spytaj o liczbe lub exit.
 * 2.
 * 3. wczytuj liczby tak dlugo az nie napisze exit
 * 4. zapisz wszystkie wpisane liczby w liscie.
 * 5. zwroc liste z liczbami
 * */

//Napisz program, który pozwoli zsumować dowolną ilość liczb od użytkownika.
//Aplikacja powinna przerwać wczytywanie liczb, gdy użytkownik wprowadzi polecenie "exit".