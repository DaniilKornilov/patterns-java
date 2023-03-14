package structural.proxy;

import structural.proxy.generator.ReportFormat;
import structural.proxy.generator.ReportGenerator;
import structural.proxy.generator.ReportGeneratorImplProxy;
import structural.proxy.role.Role;

public class Main {

    public static void main(String[] args) {
        Role accessRole = Role.MANAGER;
        ReportGenerator proxy = new ReportGeneratorImplProxy(accessRole);
        proxy.generateComplexReport(ReportFormat.PDF);
        proxy.generateSensitiveReport(ReportFormat.EXCEL);

        accessRole = Role.USER;
        proxy = new ReportGeneratorImplProxy(accessRole);
        proxy.generateSensitiveReport(ReportFormat.PDF);
    }

}
