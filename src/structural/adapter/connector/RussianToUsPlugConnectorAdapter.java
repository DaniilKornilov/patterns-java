package structural.adapter.connector;

public class RussianToUsPlugConnectorAdapter implements UsPlugConnector {

    private final RussianPlugConnector russianPlugConnector;

    public RussianToUsPlugConnectorAdapter(RussianPlugConnector russianPlugConnector) {
        this.russianPlugConnector = russianPlugConnector;
    }

    @Override
    public void supplyElectricity() {
        russianPlugConnector.provideElectricity();
    }

}
