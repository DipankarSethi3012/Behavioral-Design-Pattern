package with;

//concrete strategy
public class AirportRideStrategy implements MatchingStrategy{
    @Override
    public void getRider(String location) {
        System.out.println("Getting airport Ride");
    }
}
