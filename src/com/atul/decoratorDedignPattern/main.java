package com.atul.decoratorDedignPattern;

public class main {
    public static void main(String[] args) {
        //this qustion about developing a pizza shop functionality
        //which serves multiple types of pizza and you have to make those pizza and find the cost of each combination
        //for example - a Viggie pizza with panner and extrancheese topping
        //for example 2 - a MargheritaPizza with extraa cheese and paneer topping with again extra cheese on top

        BasePizza myCreationExample1 = new PannerTopping(new ExtraCheeseTopping(new VeggiePizza()));
        System.out.println(myCreationExample1.cost());
        BasePizza myCreationExample2 = new ExtraCheeseTopping(new PannerTopping(new ExtraCheeseTopping(new VeggiePizza())));
        System.out.println(myCreationExample2.cost());
    }
}
