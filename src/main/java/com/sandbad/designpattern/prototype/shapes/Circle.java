package com.sandbad.designpattern.prototype.shapes;

public class Circle extends Shape{

    public int radius;

    public Circle() {
    }

    public Circle(Circle target) {
        super(target);
        if (target != null)
            this.radius = target.radius;
    }

    @Override
    public Shape clone() {
        return new Circle(this);
    }

    @Override
    public boolean equals(Object sampleObject) {
        if (!(sampleObject instanceof Circle)) return false;
        Circle circleNoTwo = (Circle) sampleObject;
        return circleNoTwo.radius == radius;
    }
}
