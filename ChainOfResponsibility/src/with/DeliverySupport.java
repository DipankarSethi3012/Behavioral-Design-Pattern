package with;

public class DeliverySupport extends SupportChain{
    @Override
    public void handleRequest(String request) {
        if(request.equalsIgnoreCase("delivery")) {
            System.out.println("Request is being handled by the delivery team");
        } else if (supportChain != null) {
            supportChain.handleRequest(request);
        } else {
            System.out.println("The chain has finished there's no such type of team available to handle your current request");
        }
    }
}
