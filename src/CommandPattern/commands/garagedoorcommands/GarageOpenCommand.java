package CommandPattern.commands.garagedoorcommands;


import CommandPattern.commands.Command;
import CommandPattern.receivers.GarageDoor;

public class GarageOpenCommand implements Command {
    GarageDoor garageDoor;

    public GarageOpenCommand(GarageDoor garageDoor) {
        this.garageDoor = garageDoor;
    }

    @Override
    public void execute() {
        garageDoor.open();
    }

    @Override
    public void undo() {
        garageDoor.close();
    }
}
