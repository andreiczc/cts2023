package ro.ase.lab3;

public class Application {

    public static void main(String[] args) throws InterruptedException {
        DbHandle handle = DbHandle.getInstance();

        handle.openDb();
        handle.openDb();
    }
}
