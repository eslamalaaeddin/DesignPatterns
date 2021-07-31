package CommandPattern.commands.garagedoorcommands;


import CommandPattern.commands.Command;
import CommandPattern.receivers.GarageDoor;

public class GarageCloseCommand implements Command {
    GarageDoor garageDoor;

    public GarageCloseCommand(GarageDoor garageDoor) {
        this.garageDoor = garageDoor;
    }

    @Override
    public void execute() {
        garageDoor.close();
    }

    @Override
    public void undo() {
        garageDoor.open();
    }
}
