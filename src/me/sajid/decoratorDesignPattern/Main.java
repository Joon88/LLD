package me.sajid.decoratorDesignPattern;

import me.sajid.decoratorDesignPattern.base.ChickenPizza;
import me.sajid.decoratorDesignPattern.base.PannerPizza;
import me.sajid.decoratorDesignPattern.decorator.ExtraCheeseDecorator;
import me.sajid.decoratorDesignPattern.decorator.ExtraOreganoDecorator;
import me.sajid.decoratorDesignPattern.decorator.PizzaDecorator;

public class Main {
    public static void main(String args[]) {
        PannerPizza pp = new PannerPizza();
        ChickenPizza cp = new ChickenPizza();

        PizzaDecorator ecpp = new ExtraCheeseDecorator(pp);
        PizzaDecorator eccp = new ExtraCheeseDecorator(cp);

        ExtraOreganoDecorator eopp = new ExtraOreganoDecorator(pp);
        ExtraOreganoDecorator eocp = new ExtraOreganoDecorator(cp);

        ExtraCheeseDecorator eceocp = new ExtraCheeseDecorator(eocp);
        ExtraCheeseDecorator eceopp = new ExtraCheeseDecorator(eopp);

        System.out.println(eceocp.getPrice());
        System.out.println(eceocp.describePizza());

        System.out.println(eceopp.getPrice());
        System.out.println(eceopp.describePizza());
    }
}
