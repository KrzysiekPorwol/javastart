package pl.javastart.library.model;

import java.util.Arrays;

public class AllClients {
  private Client[] clients;
  private int size;

  public AllClients(int howMuchClients) {
    this.clients = new Client[howMuchClients];
    this.size = 0;
  }

  public void addClient(Client client) {
    clients[size] = client;
    size++;
  }

  public Client getClient(int index) {
    return clients[index];
  }

  public Client[] getClients() {
    return clients;
  }

  public void setClients(Client[] clients) {
    this.clients = clients;
  }

  public int getSize() {
    return size;
  }

  @Override
  public String toString() {
    return "AllClients{" +
          "clients=" + Arrays.toString(clients) +
          ", size=" + size +
          '}';
  }

  public void FilteringBigValueCustomer() {
    Client topClient = clients[0];
    for (int i = 0; i < clients.length; i++) {
      if (topClient.getValueCustomer() < clients[i].getValueCustomer()) {
        topClient = clients[i];
      }
    }
    System.out.println(topClient.toString());
  }

  public void FilteringAllCountries(String UserCountry) {
    double averageValue = 0;
    int howMuchClients = 0;
    for (int i = 0; i < clients.length; i++) {
      if (UserCountry.equals(clients[i].getCountry())) {
        howMuchClients++;
        averageValue = averageValue + clients[i].getValueCustomer();
        System.out.println(clients[i].toString());
      }
    }
    if (howMuchClients == 0) {
      System.out.println("Niestety nie znaleziono zadnego pasującego klienta do tego kraju.");
    } else {
      System.out.println("Srednia wartości zakupów dla kraju " + UserCountry + ": " + averageValue / howMuchClients);
    }
  }
}
