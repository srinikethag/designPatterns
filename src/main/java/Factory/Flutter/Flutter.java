package Factory.Flutter;

public abstract class Flutter {

    private int refreshRate;

    public void setTheme(String theme){
        System.out.println("Theme has been set to : " + theme);
    }

    public void setRefreshRate(int refreshRate){
        this.refreshRate = refreshRate;
    }

    public abstract UiFactory createUiFactory();

}
