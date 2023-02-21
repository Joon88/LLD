package me.sajid.decoratorDesignPattern.base;

public class PannerPizza implements BasePizza {

    private int price = 100;

    @Override
    public int getPrice() {
        return price;
    }

    @Override
    public String describePizza() {
        return "This pizza contains paneer of Rs. " + price;
    }
}
