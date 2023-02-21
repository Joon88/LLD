package me.sajid.decoratorDesignPattern.decorator;

import me.sajid.decoratorDesignPattern.base.BasePizza;

public class ExtraOreganoDecorator extends PizzaDecorator{
    private BasePizza bp;
    private int price = 15;
    public ExtraOreganoDecorator(BasePizza bp) {
        super(bp);
        this.bp = bp;
    }

    @Override
    public int getPrice() {
        return bp.getPrice() + price;
    }

    @Override
    public String describePizza() {
        return bp.describePizza() + " and extra oregano of Rs. " + price;
    }
}
