package com.atul.factoryPattern;

public class main {
    public static void main(String[] args) {
        ShapeFactory shapeFactory = new ShapeFactory();
        Shape result = shapeFactory.getShape("circle");
        result.draw();
    }
}
