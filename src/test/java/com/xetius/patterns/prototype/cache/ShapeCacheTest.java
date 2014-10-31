package com.xetius.patterns.prototype.cache;

import com.xetius.patterns.prototype.model.*;
import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;

public class ShapeCacheTest {
    private Shape circle;
    private Shape rectangle;
    private Shape triangle;

    private ShapeCache cache;

    @Before
    public void setUp() throws Exception {
        circle = new Circle(ShapeType.CIRCLE);
        rectangle = new Rectangle(ShapeType.RECTANGLE);
        triangle = new Triangle(ShapeType.TRIANGLE);

        cache = new ShapeCache();
        cache.loadCache(circle, rectangle, triangle);
    }

    @Test
    public void returnedShapeIsClonedFromOriginal() throws Exception {
        Shape cachedCircle = cache.getShape(ShapeType.CIRCLE);

        assertThat(cachedCircle, equalTo(circle));
        assertThat(cachedCircle == circle, is(false));

        assertThat(cachedCircle.draw(), equalTo("I am Circle"));
    }

    @Test
    public void drawMethodReturnsSpecificStringFromClone() throws Exception {
        Shape cachedTriangle = cache.getShape(ShapeType.TRIANGLE);
        String drawString = cachedTriangle.draw();
        String expectedString = "I am Triangle";
        assertThat(drawString, equalTo(expectedString));
    }
}