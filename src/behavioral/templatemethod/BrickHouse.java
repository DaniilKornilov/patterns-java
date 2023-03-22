package behavioral.templatemethod;

public class BrickHouse extends HouseTemplate {

    @Override
    protected void buildPillars() {
        System.out.println("Building brick pillars");
    }

    @Override
    protected void buildWalls() {
        System.out.println("Building brick walls");
    }

}
