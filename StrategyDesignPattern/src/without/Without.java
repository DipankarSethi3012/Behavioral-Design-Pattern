package without;

public class Without {
    public static void main(String[] args) {
        RideMatchingService rideMatchingService = new RideMatchingService();
        rideMatchingService.getRider("123x-135y", "airportqueue");
    }
}
//ocp breaks
//not reusable
//not scalable
