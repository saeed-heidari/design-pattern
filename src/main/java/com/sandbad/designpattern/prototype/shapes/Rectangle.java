package com.sandbad.designpattern.prototype.shapes;

public class Rectangle extends Shape {

    public int width;
    public int height;

    public Rectangle() {
    }

    public Rectangle(Rectangle target) {
        super(target);
        if (target != null)
            this.width = target.width;
            this.height = target.height;
    }

    @Override
    public Rectangle clone() {
        return new Rectangle(this);
    }

    @Override
    public boolean equals(Object sampleObject) {
        if (!(sampleObject instanceof Rectangle)) return false;
        Rectangle rectangleNoTwo = (Rectangle) sampleObject;
        return rectangleNoTwo.width == width && rectangleNoTwo.height == height;
    }
}
