package com.xetius.patterns.prototype.model;

public class Circle extends Shape {

    public Circle(ShapeType id) {
        super(id, id.getType());
    }

    @Override
    public String draw() {
        return "I am " + getType();
    }

}
