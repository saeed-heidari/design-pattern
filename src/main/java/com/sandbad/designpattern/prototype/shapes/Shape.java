package com.sandbad.designpattern.prototype.shapes;

import java.util.Objects;

public abstract class Shape {

    public int x;
    public int y;
    public String color;

    public Shape() {
    }

    public Shape(Shape target) {
        if (target != null) {
            this.x = target.x;
            this.y = target.y;
            this.color = target.color;
        }
    }

    public abstract Shape clone();

    @Override
    public boolean equals(Object secondObject) {
        if (!(secondObject instanceof Shape)) return false;
        Shape shapeNoTwo = (Shape) secondObject;
        return shapeNoTwo.x == x && shapeNoTwo.y == y && Objects.equals(shapeNoTwo.color, color);

    }
}
