package com.atul.decoratorDedignPattern;

public class PannerTopping extends BaseTopping {
    BasePizza basePizza;

    public PannerTopping(BasePizza basePizza) {
        this.basePizza = basePizza;
    }

    @Override
    public int cost() {
        return basePizza.cost() + 30;
    }
}
