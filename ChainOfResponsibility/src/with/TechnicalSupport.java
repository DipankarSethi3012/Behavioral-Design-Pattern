package with;

public class TechnicalSupport extends SupportChain {
    @Override
    public void handleRequest(String request) {
        System.out.println("Request reaches the technical support");
        if(request.equalsIgnoreCase("technical")) {
            System.out.println("Request is being handled by the Technical Support");
        } else if (supportChain != null) {
            supportChain.handleRequest(request);
        }
    }
}
