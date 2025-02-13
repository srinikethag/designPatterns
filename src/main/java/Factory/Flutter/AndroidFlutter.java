package Factory.Flutter;

public class AndroidFlutter extends Flutter{


    @Override
    public UiFactory createUiFactory() {
        return new AndroidUiFactory();
    }
}
