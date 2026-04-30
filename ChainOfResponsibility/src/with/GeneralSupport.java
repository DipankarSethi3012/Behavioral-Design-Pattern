package with;

public class GeneralSupport extends SupportChain{

    @Override
    public void handleRequest(String request) {
        if(request.equalsIgnoreCase("general")) {
            System.out.println("Request is being handled by the general Support");
        } else if(supportChain != null) {
            System.out.println("General support forwarding the request");
           supportChain.handleRequest(request);
        }
    }
}
