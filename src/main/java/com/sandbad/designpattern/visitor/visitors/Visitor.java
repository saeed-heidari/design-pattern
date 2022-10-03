package com.sandbad.designpattern.visitor.visitors;

import com.sandbad.designpattern.visitor.shapes.Circle;
import com.sandbad.designpattern.visitor.shapes.CompoundShape;
import com.sandbad.designpattern.visitor.shapes.Dot;
import com.sandbad.designpattern.visitor.shapes.Rectangle;

public interface Visitor {
    String visitDot(Dot dot);

    String visitCircle(Circle circle);

    String visitRectangle(Rectangle rectangle);

    String visitCompoundGraphic(CompoundShape cg);
}
