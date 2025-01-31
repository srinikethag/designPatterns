package adapter;

import adapter.sdk.ICICIBank;

public class ICICIBankAdaptor implements BankingService {

    ICICIBank iciciBank = new ICICIBank();

    @Override
    public void addMember(User user) {
        iciciBank.register(user.getName(), user.getAadhaar());
    }
}
