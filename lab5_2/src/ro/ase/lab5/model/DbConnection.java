package ro.ase.lab5.model;

public class DbConnection {

    private static DbConnection instance;

    private String host;
    private int port;
    private String dbName;
    private String schemaName;

    private DbConnection(String host, int port) {
        this.host = host;
        this.port = port;
    }

    public static synchronized DbConnection getInstance(String host, int port) {
        if(instance == null) {
            instance = new DbConnection(host, port);
        }

        return instance;
    }
}
