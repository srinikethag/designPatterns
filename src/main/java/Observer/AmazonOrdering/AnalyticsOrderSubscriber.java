package Observer.AmazonOrdering;

public class AnalyticsOrderSubscriber implements Subscriber{

    @Override
    public void onOrderPlace() {
        System.out.println("Called analytics service");
    }
}
