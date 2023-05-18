package ro.ase.cts.command;

import ro.ase.cts.command.command.Command;
import ro.ase.cts.command.service.SaveService;

public class Main {

    /**
     * Button -> presentation
     *      Command -> business logic, represented by CommandInterface
     *          ServiceDescription -> does the actual logic, represent by ServiceInterface
     */

    public static void main(String[] args) {
        var button = new Button(new Command(new SaveService()));

        button.execute("Hello world");
    }
}