package com.sandbad.designpattern.visitor.shapes;

import com.sandbad.designpattern.visitor.visitors.Visitor;

public interface Shape {
    void move(int x, int y);
    void draw();
    String accept(Visitor visitor);
}
