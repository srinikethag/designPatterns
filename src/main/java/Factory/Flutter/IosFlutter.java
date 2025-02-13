package Factory.Flutter;

public class IosFlutter extends Flutter {

    @Override
    public UiFactory createUiFactory() {
        return new IosUiFactory();
    }
}
