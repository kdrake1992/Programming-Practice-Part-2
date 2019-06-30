import java.util.HashMap;

public class Flight {

    private HashMap<String, String> flights;

    public Flight() {
        this.flights = new HashMap<String, String>();
    }

    public void addFlight(String plane, String from, String to) {
        String flightPath = "(" + from + "-" + to + ")";

        this.flights.put(flightPath, plane);
    }

    public void printAllFlights(Plane plane) {
        for(String key : this.flights.keySet()) {
            System.out.println(plane.findPlane(flights.get(key)) + " " + key);
        }

    }
}
