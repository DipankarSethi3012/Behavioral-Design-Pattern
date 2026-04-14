package with;

//concrete Commands
public class ACOffCommand implements Command{
    private AC ac;

    ACOffCommand(AC Ac) {
        this.ac = Ac;
    }
    @Override
    public void execute() {
        ac.off();
    }

    @Override
    public void undo() {
        ac.on();
    }
}
