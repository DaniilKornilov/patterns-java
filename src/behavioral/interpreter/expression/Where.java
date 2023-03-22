package behavioral.interpreter.expression;

import behavioral.interpreter.DataContext;

import java.util.List;
import java.util.function.Predicate;

public class Where implements Expression {

    private final Predicate<String> filter;

    private Where(Predicate<String> filter) {
        this.filter = filter;
    }

    public static Where of(Predicate<String> filter) {
        return new Where(filter);
    }

    @Override
    public List<String> interpret(DataContext dataContext) {
        dataContext.setWhereFilter(filter);
        return dataContext.search();
    }

}
