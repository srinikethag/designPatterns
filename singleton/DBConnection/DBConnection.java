package singleton.DBConnection;

public class DBConnection {
    private static DBConnection instance = null;

    String url;
    String username;
    String password;

    private DBConnection() {
    }

    public static DBConnection getInstance() {
        try {
            Thread.sleep(10);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        if (instance == null) {
            instance = new DBConnection();
        }
        return instance;
    }
}
