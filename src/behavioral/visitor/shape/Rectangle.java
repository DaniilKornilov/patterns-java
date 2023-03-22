package behavioral.visitor.shape;

import behavioral.visitor.Visitor;

public record Rectangle(Dot center, int width, int height) implements Shape {

    @Override
    public String accept(Visitor visitor) {
        return visitor.visitRectangle(this);
    }

}
