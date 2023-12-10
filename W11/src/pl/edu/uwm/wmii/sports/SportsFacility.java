package pl.edu.uwm.wmii.sports;

public class SportsFacility {
    String type;
    String location;
    int capacity;

    public SportsFacility(String type, String location, int capacity) {
        this.type = type;
        this.location = location;
        this.capacity = capacity;
    }
    public SportsFacility createStadium(String type, String location, int capacity)
    {
       SportsFacility newStadion = new SportsFacility(type, location , capacity);

        return newStadion;
    }

    public SportsFacility createFacility(String type, String location, int capacity) {
        return new SportsFacility(type, location, capacity);
    }
}
