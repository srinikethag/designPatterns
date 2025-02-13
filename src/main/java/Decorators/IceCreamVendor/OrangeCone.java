package Decorators.IceCreamVendor;

public class OrangeCone implements IceCream{

    IceCream iceCream;

    // need 2 constructors here as cone can be base as well as topping
    public OrangeCone(){

    }

    public OrangeCone(IceCream iceCream){
        this.iceCream = iceCream;
    }


    @Override
    public int getCost() {
        if(iceCream == null){
            return 10;
        }
        return iceCream.getCost() + 10;
    }

    @Override
    public String getDescription() {
        if(iceCream == null){
             return "Starting with Orange cone";
        }

        return iceCream.getDescription() + " + Orange cone";
    }
}
