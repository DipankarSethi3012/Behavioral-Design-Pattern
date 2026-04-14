package with;

//Macro Command (Batch Command Processing)
public class NightMode implements Command{
    private Light light;
    private AC ac;

    NightMode(Light light, AC ac) {
        this.ac = ac;
        this.light = light;
    }
    @Override
    public void execute() {
        light.off();
        ac.on();
    }

    @Override
    public void undo() {
        light.on();
        ac.off();
    }
}
