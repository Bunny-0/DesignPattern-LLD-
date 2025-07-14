package com.example.Design.Pattern.Structural.Decorator;

public abstract class PizzaDecorator implements Pizza{

    PlainPizza plainPizza;

    public PizzaDecorator(PlainPizza plainPizza) {
        this.plainPizza = plainPizza;
    }
    @Override
    public String getDescription() {
        return plainPizza.getDescription() ;
    }

    @Override
    public double getCost() {
        return  plainPizza.getCost() ;
    }
}
