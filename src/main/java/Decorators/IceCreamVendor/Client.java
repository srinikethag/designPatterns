package Decorators.IceCreamVendor;

public class Client {

    public static void main(String[] args) {

        IceCream iceCream =
                new OrangeCone(
                        new VanillaIceCream(
                                new OrangeCone(
                                        new VanillaIceCream(
                                                new VanillaIceCream(
                                                        new OrangeCone()
                                                )
                                        )
                                )
                        )
        );

        System.out.println(iceCream.getCost());
        System.out.println(iceCream.getDescription());
    }
}
