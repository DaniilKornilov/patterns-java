package behavioral.templatemethod;

public abstract class HouseTemplate {

    public final void buildHouse() {
        buildFoundation();
        buildPillars();
        buildWalls();
        buildWindows();
        System.out.println("House is built");
    }

    private void buildFoundation() {
        System.out.println("Building cement foundation");
    }

    protected abstract void buildPillars();

    protected abstract void buildWalls();

    private void buildWindows() {
        System.out.println("Building glass windows");
    }

}
