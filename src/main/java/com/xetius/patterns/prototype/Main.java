package com.xetius.patterns.prototype;

import com.xetius.patterns.prototype.cache.ShapeCache;
import com.xetius.patterns.prototype.model.Circle;
import com.xetius.patterns.prototype.model.Rectangle;
import com.xetius.patterns.prototype.model.ShapeType;
import com.xetius.patterns.prototype.model.Triangle;

import java.util.Arrays;
import java.util.List;

public class Main {
    private ShapeCache cache;

    public static void main(String[] args) {
        new Main().run();
    }

    private void run() {
        initialiseCache();

        List<ShapeType> shapeTypes = Arrays.asList(ShapeType.values());
        shapeTypes.forEach(shapeType -> System.out.println(cache.getShape(shapeType).draw()));
    }

    private void initialiseCache() {
        cache = new ShapeCache();

        cache.loadCache(new Circle(ShapeType.CIRCLE), new Rectangle(ShapeType.RECTANGLE), new Triangle(ShapeType.TRIANGLE));
    }
}
