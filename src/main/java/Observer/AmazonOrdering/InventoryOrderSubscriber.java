package Observer.AmazonOrdering;

public class InventoryOrderSubscriber implements Subscriber{


    @Override
    public void onOrderPlace() {
        System.out.println("Called Inventory service");
    }
}
