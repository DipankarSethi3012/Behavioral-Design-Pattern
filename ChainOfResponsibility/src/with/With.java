package with;

public class With {
    public static void main(String[] args) {
        SupportChain general = new GeneralSupport();
        SupportChain technical = new TechnicalSupport();
        SupportChain delivery = new DeliverySupport();

        // Setting up the chain: general -> billing -> technical -> delivery
        general.setNextHandler(technical);
        technical.setNextHandler(delivery);

//        general.handleRequest("general");
        general.handleRequest("technical");

    }
}
