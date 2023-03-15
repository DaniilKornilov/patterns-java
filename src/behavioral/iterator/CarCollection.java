package behavioral.iterator;

import java.util.List;

public class CarCollection implements IterableCollection<Car> {

    private final List<Car> cars;

    public CarCollection(List<Car> cars) {
        this.cars = cars;
    }

    @Override
    public Iterator<Car> createIterator() {
        return new CarIterator();
    }

    private class CarIterator implements Iterator<Car> {

        int index = 0;

        @Override
        public boolean hasNext() {
            return index < cars.size();
        }

        @Override
        public Car getNext() {
            if (hasNext()) {
                return cars.get(index++);
            }
            return null;
        }

    }

}
