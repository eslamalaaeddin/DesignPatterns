package CommandPattern.invokers;

import CommandPattern.commands.Command;
import CommandPattern.commands.NoCommand;

public class RemoteControl {
    Command[] onCommands;
    Command[] offCommands;
    Command undoCommand;

    public RemoteControl() {
        onCommands = new Command[7];
        offCommands = new Command[7];

        NoCommand noCommand = new NoCommand();

        for (int i = 0 ; i <onCommands.length ; i++) {
            onCommands[i] = noCommand;
            offCommands[i] = noCommand;
        }
        undoCommand = noCommand;
    }

    public void setCommand(int slot,Command onCommand,Command offCommand) {
       onCommands[slot] = onCommand;
       offCommands[slot] = offCommand;
    }

    public void onButtonClicked(int slot) {
        onCommands[slot].execute();
        undoCommand = onCommands[slot];
    }

    public void offButtonClicked(int slot) {
        offCommands[slot].execute();
        undoCommand = offCommands[slot];
    }

    public void undoButtonIsClicked() {
        undoCommand.undo();
    }
}
