package structural.adapter;

import structural.adapter.connector.RussianPlugConnector;
import structural.adapter.connector.RussianPlugConnectorImpl;
import structural.adapter.connector.RussianToUsPlugConnectorAdapter;
import structural.adapter.connector.UsPlugConnector;
import structural.adapter.connector.UsPlugConnectorImpl;
import structural.adapter.socket.RussianElectricalSocket;
import structural.adapter.socket.UsElectricalSocket;

public class Main {

    public static void main(String[] args) {
        RussianPlugConnector russianPlugConnector = new RussianPlugConnectorImpl();
        UsPlugConnector usPlugConnector = new UsPlugConnectorImpl();

        UsElectricalSocket usElectricalSocket = new UsElectricalSocket(usPlugConnector);
        usElectricalSocket.plugIn();

        RussianElectricalSocket russianElectricalSocket = new RussianElectricalSocket(russianPlugConnector);
        russianElectricalSocket.plugIn();

        UsPlugConnector usPlugConnectorAdapter = new RussianToUsPlugConnectorAdapter(russianPlugConnector);
        UsElectricalSocket usElectricalSocketForAdapter = new UsElectricalSocket(usPlugConnectorAdapter);
        usElectricalSocketForAdapter.plugIn();
    }

}
