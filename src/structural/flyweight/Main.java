package structural.flyweight;

import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<String> colors = List.of("Red", "Green", "Blue", "Orange");
        colors.forEach(CarFactory::getCar);

        Car blueCar1 = CarFactory.getCar("Blue");
        Car blueCar2 = CarFactory.getCar("Blue");

        System.out.println(System.identityHashCode(blueCar1) == System.identityHashCode(blueCar2));

        Car greenCar = CarFactory.getCar("Green");

        System.out.println(System.identityHashCode(blueCar1) == System.identityHashCode(greenCar));
    }

}
