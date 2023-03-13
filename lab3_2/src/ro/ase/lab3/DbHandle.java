package ro.ase.lab3;

public class DbHandle {

    private static DbHandle instance;

    private boolean isOpened = false;

    public static DbHandle getInstance() {
        if(instance == null) {
            instance = new DbHandle();
        }

        return instance;
    }

    private DbHandle() {

    }

    public void openDb() {
        System.out.println("Checking if DB is open...");
        if(isOpened) {
            throw new UnsupportedOperationException();
        }

        System.out.println("Opening DB");
        isOpened = true;
    }

    public void closeDb() {
        if(!isOpened) {
            throw new UnsupportedOperationException();
        }

        isOpened = false;
    }

}
