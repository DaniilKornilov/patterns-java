package structural.proxy.generator;

public enum ReportFormat {

    PDF("PDF"),

    EXCEL("EXCEL");

    private final String name;

    ReportFormat(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
