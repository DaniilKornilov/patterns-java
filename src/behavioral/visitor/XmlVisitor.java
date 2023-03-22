package behavioral.visitor;

import behavioral.visitor.shape.Circle;
import behavioral.visitor.shape.Dot;
import behavioral.visitor.shape.Rectangle;
import behavioral.visitor.shape.Shape;

import java.util.List;

public class XmlVisitor implements Visitor {

    public String export(List<Shape> shapes) {
        StringBuilder sb = new StringBuilder();
        sb.append("<?xml version=\"1.0\" encoding=\"utf-8\"?>" + "\n");
        for (Shape shape : shapes) {
            sb.append(shape.accept(this)).append("\n");
        }
        return sb.toString();
    }

    @Override
    public String visitDot(Dot dot) {
        return "<dot>" + "\n" +
                "    <x>" + dot.x() + "</x>" + "\n" +
                "    <y>" + dot.y() + "</y>" + "\n" +
                "</dot>";
    }

    @Override
    public String visitCircle(Circle circle) {
        return "<circle>" + "\n" +
                "    <x>" + circle.center().x() + "</x>" + "\n" +
                "    <y>" + circle.center().y() + "</y>" + "\n" +
                "    <radius>" + circle.radius() + "</radius>" + "\n" +
                "</circle>";
    }

    @Override
    public String visitRectangle(Rectangle rectangle) {
        return "<rectangle>" + "\n" +
                "    <x>" + rectangle.center().x() + "</x>" + "\n" +
                "    <y>" + rectangle.center().y() + "</y>" + "\n" +
                "    <width>" + rectangle.width() + "</width>" + "\n" +
                "    <height>" + rectangle.height() + "</height>" + "\n" +
                "</rectangle>";
    }

}
