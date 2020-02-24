package di.solution.service;

import di.solution.models.Client;
import di.solution.notificator.EmailNotificator;
import di.solution.notificator.Notifier;

public class ClientActivator {

    private Notifier notifier;

    public ClientActivator(Notifier notifier) {
        this.notifier = notifier;
    }

    public void activeClient(Client client) {
        client.setActive(true);
        notifier.notifyClient(client);
    }
}
