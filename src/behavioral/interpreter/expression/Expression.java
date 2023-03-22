package behavioral.interpreter.expression;

import behavioral.interpreter.DataContext;

import java.util.List;

public interface Expression {

    List<String> interpret(DataContext dataContext);

}
