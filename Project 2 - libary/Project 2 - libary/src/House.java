public class House {
  double waterSupply;
  double energyReserve;

  House(double newWaterSupply, double newEnergyReserve) {
    waterSupply = newWaterSupply;
    energyReserve = newEnergyReserve;
  }

  double takeShower() {
    System.out.println("Bierzemy prysznic");
    waterSupply = waterSupply - 48;
    return waterSupply;
  }

  double takeBath() {
    System.out.println("Bierzemy kąpiel");
    waterSupply = waterSupply - 86;
    return waterSupply;
  }

  double makeDinner() {
    System.out.println("Robimy obiad");
    energyReserve = energyReserve - 0.1;
    waterSupply = waterSupply - 4;
    return waterSupply + energyReserve;
  }

  double boilWater() {
    System.out.println("Podgrzewamy wodę");
    energyReserve = energyReserve - 0.05;
    waterSupply = waterSupply - 0.5;
    return waterSupply + energyReserve;
  }

  double watchTv(int time) {
    System.out.println("Oglądamy telewizję przez " + time + "godzin/y");
    energyReserve = energyReserve - 0.06 * time;
    return energyReserve;
  }

  void houseInfo() {
    System.out.println("Oto zasoby Twojego domu: ");
    System.out.println("Ilosc zapasu wody: " + waterSupply + " Ilosc zapasu ropy: " + energyReserve);
  }
}

/*
takeShower() - metoda która odpowiada wzięciu prysznica przez 1 osobę. Jeden prysznic powoduje
zużycie 48 litrów wody.

takeBath() - metoda, która odpowiada pojedynczej kąpieli. Jedna kąpiel powoduje zużycie 86 litrów wody.

makeDinner() - metoda, która symuluje ugotowanie obiadu. Operacja ta powoduje zużycie 0,1L ropy
(do wytworzenia prądu) i 4L wody.

boilWater() - metoda, która symuluje ugotowanie wody w czajniku elektrycznym.
Operacja ta powoduje zużycie 0,05L ropy (do wytworzenia prądu) oraz 0,5 litra wody
(taka jest pojemność czajnika).

watchTv() - metoda, która przyjmuje jako parametr liczbę godzin, przez jaką
oglądaliśmy telewizję. Oglądanie telewizora przez 1 godzinę, powoduje zużycie
0,06L ropy (do wytworzenia prądu). Zakładamy, że zawsze telewizor oglądamy licząc w pełnych godzinach.
*/