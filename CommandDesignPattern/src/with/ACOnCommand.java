package with;

//concrete commands
public class ACOnCommand implements Command{
    private AC AC;
    ACOnCommand(AC AC) {
        this.AC = AC;
    }

    @Override
    public void execute() {
        AC.on();
    }

    @Override
    public void undo() {
        AC.off();
    }
}
