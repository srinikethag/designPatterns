package Observer.AmazonOrdering;

import java.util.List;

public class Client {

    public static void main(String[] args) {

        Amazon amazon = new Amazon();

        amazon.addSubscriber(new InventoryOrderSubscriber());
        amazon.addSubscriber(new AnalyticsOrderSubscriber());

        amazon.placeOrder(1);
    }
}
