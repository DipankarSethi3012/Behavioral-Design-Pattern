package with;


public class With {
    public static void main(String[] args) {
        RideMatchingService rideMatchingService = new RideMatchingService(new AirportRideStrategy());
        rideMatchingService.getRide("123x-345y");
    }
}
