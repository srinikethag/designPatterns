package adapter.sdk;

// 3rd party code, no changes can be done here
public class ICICIBank {

    public void register(String name, String aadhaar){
        System.out.println("Registered with ICICI");
    }

    boolean pay(double amount, String account){
        System.out.println("Paid to account");
        return true;
    }
}
