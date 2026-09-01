package pl.javastart.library.app;

import pl.javastart.library.logic.file.FileService;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class App {

  static void main() {
    FileService fileService = new FileService();

    List<String> allWords = fileService.fileReader();

    List<String> allWordsWithoutPeriodAndComma = allWords.stream()
          .map(App::removePeriodAndComma)
          .collect(Collectors.toCollection(ArrayList<String>::new));

    allWordsWithoutPeriodAndComma.stream().filter(App::wordStartLetterS).forEach(System.out::println);

    System.out.println("Liczba słow zawierajacych dokladmie 5 znakow to : " + allWordsWithoutPeriodAndComma.stream().filter(s -> s.length() == 5).count());
  }




  public static String removePeriodAndComma(String word) {
    return word.replace(",", "").replace(".", "");
  }

  public static boolean wordStartLetterS(String word) {
    return word.charAt(0) == 's' || word.charAt(0) == 'S';
  }

}


//usuń wszystkie przecinki i kropki doklejone do słów,
//wyświetl liczbę słów rozpoczynających się znakiem "s" oraz ile słów składa się z 5 znaków.
