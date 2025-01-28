package Factory.Flutter;

public class AndroidUiFactory implements UiFactory {


    @Override
    public String createButton() {
        return "Button";
    }

    @Override
    public String createMenu() {
        return "AndroidMenu";
    }

    @Override
    public String createScrollBar() {
        return "ScrollBar";
    }
}
