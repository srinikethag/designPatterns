package adapter.bankingSystem;

public class User {

    private String name;
    private String aadhaar;

    public User(String name, String aadhaar){
        this.name = name;
        this.aadhaar = aadhaar;
    }

    public String getName(){
        return this.name;
    }

    public String getAadhaar(){
        return this.aadhaar;
    }

}
