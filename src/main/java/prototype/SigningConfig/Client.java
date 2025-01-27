package prototype.SigningConfig;

public class Client {
    public static void main(String[] args) {
        SigningConfig obj1 = new CloudSigningConfig("key1", "cert1", "url");

        SigningConfig copy = createCopy(obj1);

        System.out.println(copy);
        System.out.println(obj1);
    }

    private static SigningConfig createCopy(SigningConfig sc){
        return sc.copy();
    }
}
