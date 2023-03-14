package structural.proxy.generator;

public interface ReportGenerator {

    String COMPLEX_REPORT_MESSAGE = "%s complex report for %s format";

    String SENSITIVE_REPORT_MESSAGE = "%s complex report for %s format";

    void generateComplexReport(ReportFormat reportFormat);

    void generateSensitiveReport(ReportFormat reportFormat);

}
