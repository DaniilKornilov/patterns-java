package behavioral.visitor.shape;

import behavioral.visitor.Visitor;

public record Circle(Dot center, int radius) implements Shape {

    @Override
    public String accept(Visitor visitor) {
        return visitor.visitCircle(this);
    }

}
