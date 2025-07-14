package com.example.Design.Pattern.Structural.Decorator;

public class MushroomPizza extends PizzaDecorator{



    MushroomPizza(PlainPizza plainPizza) {
        super(plainPizza);
    }
    @Override
    public String getDescription() {
        return plainPizza.getDescription() + ", Mushroom";
    }

    @Override
    public double getCost() {
        return plainPizza.getCost() + 1.75;
    }
}
