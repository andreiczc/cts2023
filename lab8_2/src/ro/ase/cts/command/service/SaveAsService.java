package ro.ase.cts.command.service;

public class SaveAsService implements ServiceInterface{

    @Override
    public void execute(String content) {
        System.out.printf("Saving %s in a new file.\n", content);
    }
}
