package with;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

//Invoker
public class RemoteControl {
    private Command[] buttons = new Command[5];
    private Stack<Command> prevCommands = new Stack<>();
    private Queue<Command> nextCommands = new LinkedList<>();

    public void setCommand(Command command, int slot) {
        buttons[slot] = command;
    }

    public void pressButton(int slot) {
        if(buttons[slot] != null) {
            buttons[slot].execute();
            prevCommands.add(buttons[slot]);
        } else {
            System.out.println("No commands for this button");
        }
    }

    public void pressUndo() {
        if(prevCommands.isEmpty()) {
            System.out.println("No undo actions to be performed");
            return;
        }

        Command command = prevCommands.pop();
        command.undo();
        nextCommands.add(command);
    }

    public void pressRedo() {
        if(nextCommands.isEmpty()) {
            System.out.println("There are no next commands to be performed");
            return;
        }

        nextCommands.poll().execute();
    }
}
