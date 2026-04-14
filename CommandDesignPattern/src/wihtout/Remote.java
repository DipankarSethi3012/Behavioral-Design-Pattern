package wihtout;

public class Remote {
    private Light light;
    private AC ac;
    private String lastAction;

    Remote(AC ac, Light light) {
        this.light = light;
        this.ac = ac;
    }

    public void lightOn() {
        light.on();
        lastAction = "LIGHT_ON";
    }

    public void lightOff() {
        light.off();
        lastAction = "LIGHT_OFF";
    }

    public void AcOn() {
        ac.on();
        lastAction = "AC_ON";
    }

    public void AcOff() {
        ac.off();
        lastAction = "AC_OFF";
    }

    public void undo() {
        if(lastAction.isEmpty()) {
            System.out.println("There's no last action");
            return;
        }

        switch (lastAction){
            case "LIGHT_ON":
                light.off();
                lastAction = "LIGHT_OFF";
                break;
            case "LIGHT_OFF":
                light.on();
                lastAction = "LIGHT_ON";
                break;
            case "AC_ON":
                ac.off();
                lastAction = "AC_OFF";
                break;
            case "AC_OFF":
                ac.on();
                lastAction = "AC_ON";
                break;
            default:
                throw new RuntimeException("Error Value");
        }
    }

}
