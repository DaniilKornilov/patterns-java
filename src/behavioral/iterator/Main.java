package behavioral.iterator;

import java.util.List;

public class Main {

    public static void main(String[] args) {
        Car ferrari = new Car("Ferrari");
        Car bentley = new Car("Bentley");
        Car mercedes = new Car("Mercedes");

        CarCollection carCollection = new CarCollection(List.of(ferrari, bentley, mercedes));
        Iterator<Car> iterator = carCollection.createIterator();

        while (iterator.hasNext()) {
            System.out.println();
            System.out.println(iterator.getNext().name());
        }
    }

}
