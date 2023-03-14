package structural.proxy.generator;

public class ReportGeneratorImpl implements ReportGenerator {

    public ReportGeneratorImpl() {
        System.out.println("ReportGeneratorImpl instance created");
    }

    @Override
    public void generateComplexReport(ReportFormat reportFormat) {
        String message = String.format(COMPLEX_REPORT_MESSAGE, this.getClass(), reportFormat.getName());
        System.out.println(message);
    }

    @Override
    public void generateSensitiveReport(ReportFormat reportFormat) {
        String message = String.format(SENSITIVE_REPORT_MESSAGE, this.getClass(), reportFormat.getName());
        System.out.println(message);
    }

}
