package prototype.SigningConfig;

public class Client {
    public static void main(String[] args) {
        SigningConfig obj1 = new CloudSigningConfig("key1", "cert1", "url");
        SigningConfig obj2 = new SigningConfig("key2", "cert2");

        Registry registry = new Registry();
        registry.add(Registry.RegistryType.CLOUD, obj1);
        registry.add(Registry.RegistryType.SIGNING, obj2);

        SigningConfig copy = createCopy(registry.get(Registry.RegistryType.CLOUD));
        SigningConfig copy2 = createCopy(registry.get(Registry.RegistryType.SIGNING));

        System.out.println(copy);
        System.out.println(obj1);
        System.out.println(copy2);
    }

    private static SigningConfig createCopy(SigningConfig sc){
        return sc.copy();
    }
}
