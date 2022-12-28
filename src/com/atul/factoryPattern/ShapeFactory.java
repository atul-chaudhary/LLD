package com.atul.factoryPattern;

public class ShapeFactory {

    public Shape getShape(String condition){
        switch (condition){
            case "circle":
                return new CircleShape();
            case "rectangle":
                return new RectangleShape();
            case "square":
                return new SquareShape();
            default:
                return null;
        }
    }
}
