public class Plants {
  public static void main(String[] args) {
    Plant rose = new Plant();
    rose.namePlant = "rose";
    rose.descriptionPlant = "Beatiful flower";
    rose.waterDemand = 0.5;

    Plant cactus = new Plant();
    cactus.namePlant = "Cactus";
    cactus.descriptionPlant = "Just cactus...";
    cactus.waterDemand = 0.01;

    Plant thuja = new Plant();
    thuja.namePlant = "Thuja";
    thuja.descriptionPlant = "Just thuja...";
    thuja.waterDemand = 1.5;

    double dailyWaterConsumption = thuja.waterDemand + cactus.waterDemand + rose.waterDemand;
    double weeklyWaterConsumption = dailyWaterConsumption * 7;
    double annualWaterConsumption = dailyWaterConsumption * 365;

    System.out.println("Dziennie zużycie wody przez wszystkie rośliny: " + dailyWaterConsumption);
    System.out.println("Tygodniowe zużycie wody przez wszystkie rośliny: " + weeklyWaterConsumption);
    System.out.println("Roczne zużycie wody przez wszystkie rośliny: " + annualWaterConsumption);
  }
}
