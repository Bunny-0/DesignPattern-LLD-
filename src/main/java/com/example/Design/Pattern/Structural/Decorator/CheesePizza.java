package com.example.Design.Pattern.Structural.Decorator;

public class CheesePizza extends PizzaDecorator {

    public CheesePizza(PlainPizza plainPizza) {
        super(plainPizza);
        this.plainPizza = plainPizza;
    }
    @Override
    public String getDescription() {
        return plainPizza.getDescription() + ", Cheese";
    }

    @Override
    public double getCost() {
        return plainPizza.getCost() + 1.50;
    }
}
