package ro.ase.cts.command.service;

public class SaveService implements ServiceInterface{
    @Override
    public void execute(String content) {
        System.out.printf("Saving %s.\n", content);
    }
}
