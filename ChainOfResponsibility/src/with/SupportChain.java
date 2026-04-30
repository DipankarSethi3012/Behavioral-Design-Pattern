package with;

public abstract class SupportChain {
    protected SupportChain supportChain;

   public void setNextHandler(SupportChain supportChain) {
       this.supportChain = supportChain;
   }

    public abstract void handleRequest(String request);
}
