package homework4.task7;

import java.util.ArrayList;
import java.util.List;
public class Park {
    // Внутренний класс для представления аттракциона
    public class Attraction {
        private String attractionName;
        private String operatingTime;
        private double cost;

        public Attraction(String attractionName, String operatingTime, double cost) {
            this.attractionName = attractionName;
            this.operatingTime = operatingTime;
            this.cost = cost;
        }

        public String getAttractionName() {
            return attractionName;
        }

        public String getOperatingTime() {
            return operatingTime;
        }

        public double getCost() {
            return cost;
        }
    }

    private List<Attraction> attractions;  // Список аттракционов в парке

    public Park() {
        attractions = new ArrayList<>();
    }

    // Метод для добавления аттракциона в парк
    public void addAttraction(String attractionName, String operatingTime, double cost) {
        Attraction newAttraction = new Attraction(attractionName, operatingTime, cost);
        attractions.add(newAttraction);
    }

    // Метод для вывода информации об аттракциях в парке
    public void printAttractionsInfo() {
        System.out.println("Attrctions avaliable in the park:");
        for (Attraction attraction : attractions) {
            System.out.println("Atraction name: " + attraction.getAttractionName());
            System.out.println("Operating time: " + attraction.getOperatingTime());
            System.out.println("Price: " + attraction.getCost());
            System.out.println();
        }
    }
}
