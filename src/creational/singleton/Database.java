package creational.singleton;

public class Database {

    private final String name = "Database";

    private Database() {
    }

    private static class SingletonDatabaseHelper {
        private static final Database INSTANCE = new Database();
    }

    public static Database getInstance() {
        return SingletonDatabaseHelper.INSTANCE;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Database{" +
                "name='" + name + '\'' +
                '}';
    }
}
