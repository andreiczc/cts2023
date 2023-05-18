package ro.ase.cts.command.command;

import ro.ase.cts.command.service.ServiceInterface;

import java.util.Date;

public class Command implements CommandInterface {

    private ServiceInterface serviceInterface;

    public Command(ServiceInterface serviceInterface) {
        this.serviceInterface = serviceInterface;
    }

    @Override
    public void execute(String content) {
        var formatted = String.format(
                "%s: %s", new Date().toString(), content
        );

        serviceInterface.execute(formatted);
    }
}
