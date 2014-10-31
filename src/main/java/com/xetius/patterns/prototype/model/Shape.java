package com.xetius.patterns.prototype.model;

public abstract class Shape implements Cloneable {
    private ShapeType id;
    protected String type;

    protected Shape(ShapeType id, String type) {
        this.id = id;
        this.type = type;
    }

    abstract public String draw();

    public String getType() {
        return type;
    }

    public ShapeType getId() {
        return id;
    }

    @Override
    public Object clone() {
        Object clone = null;
        try {
            clone = super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return clone;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Shape shape = (Shape) o;

        if (id != shape.id) return false;
        if (type != null ? !type.equals(shape.type) : shape.type != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id != null ? id.hashCode() : 0;
        result = 31 * result + (type != null ? type.hashCode() : 0);
        return result;
    }
}
