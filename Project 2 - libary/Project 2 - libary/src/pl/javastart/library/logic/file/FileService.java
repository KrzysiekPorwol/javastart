package pl.javastart.library.logic.file;

import java.io.*;
import java.util.ArrayList;
import java.util.List;


public class FileService {

  public List<String > fileReader() {
    String fileName = "/Users/krzysztofporwol/javastart/loremIpsum.txt";
    List<String> allWords = new ArrayList<>();

    try (
          var fr = new FileReader(fileName);
          var br = new BufferedReader(fr);
    ) {
      String line;
      while ((line = br.readLine()) != null) {
        String[] wordsInLine = line.split("\\s+");
        for (String word : wordsInLine) {
          if (!word.isBlank()) {      // pomijamy puste "słowa"
            allWords.add(word);
          }
        }
      }

//      try (var br = new BufferedReader(new FileReader(fileName))) {
//        return br.lines()                                  // Stream<String> – linie
//              .flatMap(line -> Arrays.stream(line.split("\\s+")))  // rozbij na słowa
//              .filter(word -> !word.isBlank())
//              .toList();
//      }



    } catch (FileNotFoundException e) {
      throw new RuntimeException(e);
    } catch (IOException e) {
      throw new RuntimeException(e);
    }

    return allWords;
  }
}
