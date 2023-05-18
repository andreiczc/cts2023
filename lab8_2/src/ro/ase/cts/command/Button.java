package ro.ase.cts.command;

import ro.ase.cts.command.command.CommandInterface;

public class Button {

    private CommandInterface commandInterface;

    public Button(CommandInterface commandInterface) {
        this.commandInterface = commandInterface;
    }

    public void execute(String content) {
        commandInterface.execute(content);
    }
}
