package pl.javastart.library.model;

public class Car {
  private int fuelLevel;
  private boolean workingEngine;
  private boolean closedFuelFlap;
  private boolean closedDoorsAndTrunk;
  private boolean engineOn = false;
  static final int CAR_ON = 100;
  static final int CAR_ENGINE_DEAD = 200;
  static final int CAR_FUEL_LEVEL_0 = 300;
  static final int CAR_ON_BUT_FUEL_FLAP_OPEN = 400;
  static final int CAR_ON_BUT_DOORS_OR_TRUNK_OPEN = 500;

  public Car(int fuelLevel, boolean workingEngine, boolean closedFuelFlap, boolean closedDoorsAndTrunk) {
    this.fuelLevel = fuelLevel;
    this.workingEngine = workingEngine;
    this.closedFuelFlap = closedFuelFlap;
    this.closedDoorsAndTrunk = closedDoorsAndTrunk;
  }

  public int getFuelLevel() {
    return fuelLevel;
  }

  public void setFuelLevel(int fuelLevel) {
    this.fuelLevel = fuelLevel;
  }

  public boolean isWorkingEngine() {
    return workingEngine;
  }

  public void setWorkingEngine(boolean workingEngine) {
    this.workingEngine = workingEngine;
  }

  public boolean isClosedFuelFlap() {
    return closedFuelFlap;
  }

  public void setClosedFuelFlap(boolean closedFuelFlap) {
    this.closedFuelFlap = closedFuelFlap;
  }

  public boolean isClosedDoorsAndTrunk() {
    return closedDoorsAndTrunk;
  }

  public void setClosedDoorsAndTrunk(boolean closedDoorsAndTrunk) {
    this.closedDoorsAndTrunk = closedDoorsAndTrunk;
  }

  public boolean isEngineOn() {
    return engineOn;
  }

  public void setEngineOn(boolean engineOn) {
    this.engineOn = engineOn;
  }

  public int start() {
    System.out.println("Odpalamy samochód");
    if (!workingEngine) {
      System.out.println("Silnik jest niesprawny!");
      return CAR_ENGINE_DEAD;
    } else if (fuelLevel == 0) {
      System.out.println("Bak jest pusty!");
      return CAR_FUEL_LEVEL_0;
    } else if (!closedFuelFlap) {
      System.out.println("Silnik włączony, ale klapa zbiornika paliwa jest otwarta!");
      engineOn = true;
      return CAR_ON_BUT_FUEL_FLAP_OPEN;
    } else if (!closedDoorsAndTrunk) {
      System.out.println("Silnik włączony, ale drzwi lub bagaznik są/jest otwarte/y!");
      engineOn = true;
      return CAR_ON_BUT_DOORS_OR_TRUNK_OPEN;
    } else {
      System.out.println("Samochód włączony!");
      engineOn = true;
      return CAR_ON;
    }
  }

  public String status() {
    if (workingEngine && fuelLevel != 0 && closedDoorsAndTrunk && closedFuelFlap) {
      return "Wszystkie systemy sprawne, możesz wyruszyć w bezpieczną podróż";
    } else if (!workingEngine) {
      return "Silnik jest uszkodzony!";
    } else if (fuelLevel == 0) {
      return "Masz pusty bak paliwa!";
    } else if (!closedFuelFlap) {
      return "Masz otwartą klapę wlewu paliwa!";
    } else {
      return "Masz otwarte drzwi i/lub bagażnik!";
    }
  }

  public String checkEngine() {
    if (engineOn && (!workingEngine || fuelLevel == 0)) {
      engineOn = false;
      return "Silnik zostal wyłączony, bo brakuje paliwa lub uległ awarii";
    } else {
      return "Silnik sprawny";
    }
  }
}


//Dodaj także metodę status(), która zwróci aktualny status pojazdu i jego systemów w postaci napisu -
// coś jak symulacja deski rozdzielczej. Jeżeli wszystko z samochodem jest ok, tzn. silnik jest sprawny,
// bak paliwa nie jest pusty, drzwi i wlew paliwa są zamknięte, to zwróć tylko komunikat "Wszystkie
// systemy sprawne, możesz wyruszyć w bezpieczną podróż". W innym przypadku zwróć informację o tym,
// co w samochodzie wymaga poprawy.
//
//Jeżeli silnik był uruchomiony, a silnik ulegnie awarii lub skończy się paliwo, to silnik powinien
// zostać wyłączony. Jeżeli system wykrywa awarię silnika lub brak paliwa, to silnika nie powinno się
// także dać uruchomić.
//
//Przetestuj działanie obu metod.
