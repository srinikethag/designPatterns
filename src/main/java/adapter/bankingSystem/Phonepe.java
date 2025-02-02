package adapter.bankingSystem;

public class Phonepe {

    BankingService bankAdaptor;

    public Phonepe(BankingService bankAdaptor){
        this.bankAdaptor = bankAdaptor;
    }

    void addUser(User user){
        bankAdaptor.addMember(user);
    }
}
