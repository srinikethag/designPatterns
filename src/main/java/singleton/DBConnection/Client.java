package singleton.DBConnection;

public class Client {
    public static void main(String[] args) {
        DBConnection databaseConnection1 = DBConnection.getInstance();
        DBConnection databaseConnection2 = DBConnection.getInstance();

        if (databaseConnection1 == databaseConnection2) {
            System.out.println("Objects are same!");
        } else {
            System.out.println("Objects are different!");
        }

        System.out.println(databaseConnection1 + " " + databaseConnection2);
    }
}
