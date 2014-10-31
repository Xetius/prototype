package com.xetius.patterns.prototype.model;

public class Rectangle extends Shape {

    public Rectangle(ShapeType id) {
        super(id, id.getType());
    }

    @Override
    public String draw() {
        return "I am " + getType();
    }
}
