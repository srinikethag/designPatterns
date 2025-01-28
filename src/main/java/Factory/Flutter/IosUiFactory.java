package Factory.Flutter;

public class IosUiFactory implements UiFactory{
    @Override
    public String createButton() {
        return "IosButton";
    }

    @Override
    public String createMenu() {
        return "IosMenu";
    }

    @Override
    public String createScrollBar() {
        return "Scrollbar";
    }
}
