package behavioral.visitor.shape;

import behavioral.visitor.Visitor;

public interface Shape {

    String accept(Visitor visitor);

}
