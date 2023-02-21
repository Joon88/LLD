package me.sajid.decoratorDesignPattern.decorator;

import me.sajid.decoratorDesignPattern.base.BasePizza;

public class ExtraCheeseDecorator extends PizzaDecorator{
    private BasePizza bp;
    private int price = 25;
    public ExtraCheeseDecorator(BasePizza bp) {
        super(bp);
        this.bp = bp;
    }

    @Override
    public int getPrice() {
        return bp.getPrice() + price;
    }

    @Override
    public String describePizza() {
        return bp.describePizza() + " and extra cheese of Rs. " + price;
    }
}
