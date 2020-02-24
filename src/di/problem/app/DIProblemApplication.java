package di.problem.app;

import di.problem.models.Client;
import di.problem.service.ClientActivator;

public class DIProblemApplication {

    public static void main(String[] args) {
        Client client1 = new Client("John");
        Client client2 = new Client("Mary");

        ClientActivator clientActivator = new ClientActivator();
        clientActivator.activeClient(client1);
        clientActivator.activeClient(client2);
    }
}
