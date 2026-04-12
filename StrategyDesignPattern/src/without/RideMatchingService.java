package without;

public class RideMatchingService {
    public void getRider(String location, String matchingType) {
        if(matchingType.equalsIgnoreCase("surgepriority")) {
            System.out.println("Priority Basics Ride");
        } else if(matchingType.equalsIgnoreCase("airportqueue")) {
            System.out.println("Airport-Queue Ride");
        } else if (matchingType.equalsIgnoreCase("nearestdriver")) {
            System.out.println("Neaarest rider");
        } else throw new RuntimeException("Wrong Argument");
    }
}
