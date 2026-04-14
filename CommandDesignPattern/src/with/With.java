package with;

public class With {
    public static void main(String[] args) {
        Light light = new Light();
        AC ac = new AC();

        RemoteControl remoteControl = new RemoteControl();
        remoteControl.setCommand(new ACOnCommand(ac), 0);
        remoteControl.setCommand(new ACOffCommand(ac), 1);
        remoteControl.setCommand(new LightOnCommand(light), 2);
        remoteControl.setCommand(new LightOffCommand(light), 3);
        remoteControl.setCommand(new NightMode(light, ac), 4);

        remoteControl.pressButton(0);
        remoteControl.pressButton(1);
        remoteControl.pressButton(2);
        remoteControl.pressButton(3);
        remoteControl.pressButton(4);
    }
}
