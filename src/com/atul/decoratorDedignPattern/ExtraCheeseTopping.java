package com.atul.decoratorDedignPattern;

public class ExtraCheeseTopping extends BaseTopping{
    BasePizza basePizza;

    public ExtraCheeseTopping(BasePizza basePizza){
        this.basePizza = basePizza;
    }

    @Override
    public int cost() {
        return basePizza.cost()+50;
    }
}
