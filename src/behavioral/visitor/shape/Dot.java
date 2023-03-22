package behavioral.visitor.shape;

import behavioral.visitor.Visitor;

public record Dot(int x, int y) implements Shape {

    @Override
    public String accept(Visitor visitor) {
        return visitor.visitDot(this);
    }

}
