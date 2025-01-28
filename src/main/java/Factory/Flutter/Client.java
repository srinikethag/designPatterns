package Factory.Flutter;

public class Client {

    public static void main(String[] args) {
        Flutter androidFlutter = new AndroidFlutter();
        Flutter iosFlutter = new IosFlutter();

        androidFlutter.createUiFactory();
        iosFlutter.createUiFactory();

    }
}
