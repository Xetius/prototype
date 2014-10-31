package com.xetius.patterns.prototype.cache;

import com.xetius.patterns.prototype.model.Shape;
import com.xetius.patterns.prototype.model.ShapeType;

import java.util.Arrays;
import java.util.Hashtable;
import java.util.List;

public class ShapeCache {
    private Hashtable<ShapeType, Shape> shapeMap = new Hashtable<>();

    public Shape getShape(ShapeType shapeId) {
        Shape cachedShape = shapeMap.get(shapeId);
        return (Shape)cachedShape.clone();
    }

    public void loadCache(Shape... shapes) {
        List<Shape> shapeList = Arrays.asList(shapes);
        shapeList.forEach(shape -> shapeMap.put(shape.getId(), shape));
    }
}
