package with;

//concrete strategy
public class NearestRideStrategy implements MatchingStrategy{
    @Override
    public void getRider(String location) {
        System.out.println("Getting the nearest rider");
    }
}
