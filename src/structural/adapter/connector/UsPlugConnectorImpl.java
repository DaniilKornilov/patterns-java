package structural.adapter.connector;

public class UsPlugConnectorImpl implements UsPlugConnector {

    private static final String PROVIDE_ELECTRICITY_MESSAGE = "US plug connectors provides electricity!";

    @Override
    public void supplyElectricity() {
        System.out.println(PROVIDE_ELECTRICITY_MESSAGE);
    }

}
