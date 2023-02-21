package me.sajid.decoratorDesignPattern.decorator;

import me.sajid.decoratorDesignPattern.base.BasePizza;

public abstract class PizzaDecorator implements BasePizza {
    private BasePizza basePizza;
    public PizzaDecorator(BasePizza bp) {
        basePizza = bp;
    }

    public abstract int getPrice();
    public abstract String describePizza();
}
