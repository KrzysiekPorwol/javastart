package pl.javastart.library.app;


import pl.javastart.library.logic.Genre;
import pl.javastart.library.logic.Song;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class MusicCollection {
  public static void main(String[] args) {
    List<Song> songs = List.of(
          new Song("Nothing Else Matters", 386, "Metallica", Genre.METAL),
          new Song("No One", 248, "Alicia Keys", Genre.POP),
          new Song("Nothing Else Matters", 386, "Metallica", Genre.METAL),
          new Song("Believer", 216, "Imagine Dragons", Genre.ROCK),
          new Song("Fear of The Dark", 438, "Iron Maiden", Genre.METAL),
          new Song("Enter Sandman", 346, "Metallica", Genre.METAL),
          new Song("The Unforgiven", 348, "Metallica", Genre.METAL),
          new Song("Girl on Fire", 404, "Alicia Keys", Genre.POP)
    );

    int howLongOneGenre = howLongOneGenre(songs, Genre.METAL);
    System.out.println("Suma długosci utworów gatunku METAL wynosi: " + howLongOneGenre + "sek.");

    long howManySongsHaveOneArtist = howManySongsHaveOneArtist(songs, "Metallica");
    System.out.println("Artysta Metallica posiada " + howManySongsHaveOneArtist + " utworów");

    ArrayList<Song> songsWithoutDuplicateAndSpecificGenre = getAllSongsWithoutDuplicateAndSpecificGenre(songs, Genre.METAL);
    System.out.println("Piosenki bez METAL: ");
    songsWithoutDuplicateAndSpecificGenre.stream().forEach(song -> System.out.println(song.toString()));

  }

  public static int howLongOneGenre(List<Song> songs, Genre genre) {
    return songs.stream()
          .filter(song -> song.getGenre() == genre)
          .mapToInt(Song::getLength)
          .sum();
  }

  public static long howManySongsHaveOneArtist(List<Song> songs, String artistName) {
    return songs.stream()
          .filter(song -> song.getArtist().equals(artistName))
          .count();
  }

  public static ArrayList<Song> getAllSongsWithoutDuplicateAndSpecificGenre(List<Song> songs, Genre genre) {
    return songs.stream()
          .filter(song -> song.getGenre() != genre)
          .distinct()
          .collect(Collectors.toCollection(ArrayList<Song>::new));
  }


//  metoda przyjmuje listę utworów i gatunek muzyczny, a zwraca łączny czas trwania wszystkich utworów danego gatunku,
//  metoda przyjmuje listę utworów i nazwę artysty, a zwraca liczbę utworów danego autora w tej liście,
//  metoda przyjmuje listę utworów i gatunek muzyczny, a zwraca listę utworów bez utworów, które miały
//  przypisany ten gatunek muzyczny oraz bez duplikatów (powtarzających się utworów).

//  Metoda 1: filter(), mapToInt() i sum().
//  Metoda 2: filter(), count().
//  Metoda 3: filter(), distinct(), collect().


}
