package behavioral.templatemethod;

public class Main {

    public static void main(String[] args) {
        HouseTemplate houseTemplate = new BrickHouse();
        houseTemplate.buildHouse();

        houseTemplate = new WoodenHouse();
        houseTemplate.buildHouse();
    }

}
