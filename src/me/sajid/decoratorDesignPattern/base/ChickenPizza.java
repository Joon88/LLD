package me.sajid.decoratorDesignPattern.base;

public class ChickenPizza implements BasePizza {
    private int price = 150;

    @Override
    public int getPrice() {
        return price;
    }

    @Override
    public String describePizza() {
        return "This pizza contains chicken of Rs. " + price;
    }
}
