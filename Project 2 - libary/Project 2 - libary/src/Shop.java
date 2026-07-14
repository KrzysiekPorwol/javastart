class Shop {
  public static void main(String[] args) {

    Product product1 = new Product("Czekolada mleczna", "Milka");
    Offer offer1 = new Offer(product1, 3.99, true);

    offer1.printInfo();
  }
}



/*
Poniżej znajdziesz kod programu, który składa się z trzech klas i pozwala reprezentować
oferty w pewnym sklepie.

Z każdą ofertą powiązany jest produkt, którego oferta dotyczy. Można ustawić także
dodatkowe pole, aby wskazać, że oferta jest specjalna (np. na dany produkt jest jakaś super promocją).

W trzeciej klasie utworzonych jest kilka ofert i wyświetlone są o nich informacje.

Tworzenie obiektów ofert zajmuje sporo miejsca. Dodaj w odpowiednich klasach konstruktory,
aby tworzenie obiektów zajmowało tylko 1 linijkę kodu. Dodatkowo przerób kod w taki sposób,
aby wyświetlanie było realizowane w metodzie klasy Offer, a nie bezpośrednio w metodzie main.public
*/