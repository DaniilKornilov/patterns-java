package behavioral.interpreter;

import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class DataContext {

    private final Map<String, List<String>> data;

    private String key;

    private Predicate<String> whereFilter;

    public DataContext(Map<String, List<String>> data) {
        this.data = data;
    }

    public void setKey(String key) {
        this.key = key;
    }

    public void setWhereFilter(Predicate<String> whereFilter) {
        this.whereFilter = whereFilter;
    }

    public List<String> search() {
        return data.entrySet()
                .stream()
                .filter(entry -> entry.getKey().equalsIgnoreCase(key))
                .flatMap(entry -> Stream.of(entry.getValue()))
                .flatMap(Collection::stream)
                .filter(whereFilter)
                .collect(Collectors.toList());
    }

}
