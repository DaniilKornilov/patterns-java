package behavioral.interpreter.expression;

import behavioral.interpreter.DataContext;

import java.util.List;

public class Select implements Expression {

    private final String key;

    private final Where where;

    private Select(String key, Where where) {
        this.key = key;
        this.where = where;
    }

    public static Select of(String key, Where where) {
        return new Select(key, where);
    }

    public static Select of(String key) {
        return new Select(key, null);
    }

    @Override
    public List<String> interpret(DataContext dataContext) {
        dataContext.setKey(key);
        if (where == null) {
            dataContext.setWhereFilter((string) -> true);
            return dataContext.search();
        }
        return where.interpret(dataContext);
    }

}
