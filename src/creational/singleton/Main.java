package creational.singleton;

public class Main {

    public static void main(String[] args) {
        Database database = Database.getInstance();
        System.out.println(database.getName());
    }

}
