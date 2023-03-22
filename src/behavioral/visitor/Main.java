package behavioral.visitor;

import behavioral.visitor.shape.Circle;
import behavioral.visitor.shape.Dot;
import behavioral.visitor.shape.Rectangle;

import java.util.List;

public class Main {

    public static void main(String[] args) {
        Dot dot = new Dot(1, 2);
        Circle circle = new Circle(dot, 4);
        Rectangle rectangle = new Rectangle(dot, 2, 6);

        XmlVisitor xmlVisitor = new XmlVisitor();
        System.out.println(xmlVisitor.export(List.of(dot, circle, rectangle)));
    }

}
