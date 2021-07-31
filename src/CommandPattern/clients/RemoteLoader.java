package CommandPattern.clients;
/*
    I did not implement undo based on state.
 */

import CommandPattern.commands.Command;
import CommandPattern.commands.MacroCommand;
import CommandPattern.commands.garagedoorcommands.GarageCloseCommand;
import CommandPattern.commands.garagedoorcommands.GarageOpenCommand;
import CommandPattern.commands.lightcommands.LightOffCommand;
import CommandPattern.commands.lightcommands.LightOnCommand;
import CommandPattern.invokers.RemoteControl;
import CommandPattern.receivers.GarageDoor;
import CommandPattern.receivers.Light;

public class RemoteLoader {
    public static void main(String[] args) {
        RemoteControl remoteControl = new RemoteControl();

        Light light = new Light();
        GarageDoor garageDoor = new GarageDoor();

        LightOnCommand lightOnCommand = new LightOnCommand(light);
        LightOffCommand lightOffCommand = new LightOffCommand(light);

        GarageOpenCommand garageOpenCommand = new GarageOpenCommand(garageDoor);
        GarageCloseCommand garageCloseCommand = new GarageCloseCommand(garageDoor);

        //Assign commands to slots

        Command[] onCommands = {lightOnCommand,garageOpenCommand};
        Command[] offCommands = {lightOffCommand,garageCloseCommand};

        MacroCommand onMacroCommand = new MacroCommand(onCommands);
        MacroCommand offMacroCommand = new MacroCommand(offCommands);

        remoteControl.setCommand(0,onMacroCommand,offMacroCommand);

        remoteControl.onButtonClicked(0);

    }
}
