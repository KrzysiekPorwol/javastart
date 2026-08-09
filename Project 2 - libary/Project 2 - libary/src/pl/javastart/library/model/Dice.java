package pl.javastart.library.model;

public class Dice {
  private String dice1 = """
         -----------
        |           |
        |     0     |
        |           |
         -----------
        """;
  private String dice2 = """
         -----------
        |           |
        |     0     |
        |           |
         -----------
        """;
  private String dice3 = """
         -----------
        | 0         |
        |     0     |
        |         0 |
         -----------
        """;
  private String dice4 = """
         -----------
        | 0       0 |
        |           |
        | 0       0 |
         -----------
        """;
  private String dice5 = """
         -----------
        | 0       0 |
        |     0     |
        | 0       0 |
         -----------
        """;
  private String dice6 = """
         -----------
        | 0       0 |
        | 0       0 |
        | 0       0 |
         -----------
        """;

  public String getDice1() {
    return dice1;
  }

  public String getDice2() {
    return dice2;
  }

  public String getDice3() {
    return dice3;
  }

  public String getDice4() {
    return dice4;
  }

  public String getDice5() {
    return dice5;
  }

  public String getDice6() {
    return dice6;
  }


}
