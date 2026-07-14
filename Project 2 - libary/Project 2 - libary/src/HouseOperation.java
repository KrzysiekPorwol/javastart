public class HouseOperation {
 public static void main() {
    House house = new House(1000, 5);
    System.out.println(house.houseInfo());
    house.boilWater();
   System.out.println(house.houseInfo());
    house.makeDinner();
   System.out.println(house.houseInfo());
    house.watchTv(4);
   System.out.println(house.houseInfo());
    house.takeShower();
   System.out.println(house.houseInfo());
  }
}
