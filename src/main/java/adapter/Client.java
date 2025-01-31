package adapter;

public class Client {
    public static void main(String[] args) {
        Phonepe phonepe = new Phonepe(new ICICIBankAdaptor());

        phonepe.addUser(new User("Adam", "34354565576"));
    }
}
