package with;

//context
public class RideMatchingService {
    private MatchingStrategy matchingStrategy;

    RideMatchingService(MatchingStrategy matchingStrategy) {
        this.matchingStrategy = matchingStrategy;
    }

    public void getRide(String location) {
        matchingStrategy.getRider(location);
    }
}
