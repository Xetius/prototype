package com.xetius.patterns.prototype.model;

public class Triangle extends Shape {

    public Triangle(ShapeType id) {
        super(id, id.getType());
    }

    @Override
    public String draw() {
        return "I am " + getType();
    }
}
