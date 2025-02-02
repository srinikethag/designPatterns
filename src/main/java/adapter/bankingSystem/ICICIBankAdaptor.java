package adapter.bankingSystem;

import adapter.bankingSystem.sdk.ICICIBank;

public class ICICIBankAdaptor implements BankingService {

    ICICIBank iciciBank = new ICICIBank();

    @Override
    public void addMember(User user) {
        iciciBank.register(user.getName(), user.getAadhaar());
    }
}
