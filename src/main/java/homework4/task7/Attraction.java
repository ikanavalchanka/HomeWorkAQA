package homework4.task7;

public class Attraction {
    private String attractionName;
    private String operatingTime;
    private int cost;
    public Attraction(String attractionName, String operatingTime, int cost) {
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

    public int getCost() {
        return cost;
    }
}

