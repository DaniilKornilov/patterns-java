package structural.flyweight;

import java.util.HashMap;

public class CarFactory {

    private CarFactory() {
    }

    private static final HashMap<String, Car> colorToCarMap = new HashMap<>();

    public static Car getCar(String color) {
        Car car = colorToCarMap.getOrDefault(color, new Car(color));
        if (!colorToCarMap.containsKey(color)) {
            colorToCarMap.put(color, car);
        }
        return car;
    }
}
