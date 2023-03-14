package structural.adapter.connector;

public class RussianPlugConnectorImpl implements RussianPlugConnector {

    private static final String PROVIDE_ELECTRICITY_MESSAGE = "Russian plug connectors provides electricity!";

    @Override
    public void provideElectricity() {
        System.out.println(PROVIDE_ELECTRICITY_MESSAGE);
    }

}
