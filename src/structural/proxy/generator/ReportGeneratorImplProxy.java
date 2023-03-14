package structural.proxy.generator;

import structural.proxy.role.Role;

public class ReportGeneratorImplProxy implements ReportGenerator {

    private static final String AUTHORIZATION_ERROR_MESSAGE = "You are not authorized to access sensitive reports!";

    private final Role accessRole;

    private final ReportGenerator reportGeneratorImpl;

    public ReportGeneratorImplProxy(Role accessRole) {
        this.accessRole = accessRole;
        this.reportGeneratorImpl = new ReportGeneratorImpl();
    }

    @Override
    public void generateComplexReport(ReportFormat reportFormat) {
        reportGeneratorImpl.generateComplexReport(reportFormat);
    }

    @Override
    public void generateSensitiveReport(ReportFormat reportFormat) {
        if (accessRole == Role.MANAGER) {
            reportGeneratorImpl.generateSensitiveReport(reportFormat);
        } else {
            System.out.println(AUTHORIZATION_ERROR_MESSAGE);
        }
    }

}
