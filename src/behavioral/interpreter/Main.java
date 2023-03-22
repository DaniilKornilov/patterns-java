package behavioral.interpreter;

import behavioral.interpreter.expression.Expression;
import behavioral.interpreter.expression.Select;
import behavioral.interpreter.expression.Where;

import java.util.List;
import java.util.Map;

public class Main {

    public static void main(String[] args) {
        Map<String, List<String>> data = Map.of(
                "car", List.of("mercedes", "ferrari"),
                "ship", List.of("cruise ship", "boat"));

        DataContext dataContext = new DataContext(data);

        Expression expression = Select.of("car", Where.of(name -> name.equals("mercedes")));
        System.out.println(expression.interpret(dataContext));

        expression = Select.of("ship");
        System.out.println(expression.interpret(dataContext));
    }

}
