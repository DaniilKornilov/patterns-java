package behavioral.visitor;

import behavioral.visitor.shape.Circle;
import behavioral.visitor.shape.Dot;
import behavioral.visitor.shape.Rectangle;

public interface Visitor {

    String visitDot(Dot dot);

    String visitCircle(Circle circle);

    String visitRectangle(Rectangle rectangle);

}
