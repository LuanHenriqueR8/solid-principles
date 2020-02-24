package di.problem.notificator;

import di.problem.models.Client;

public class EmailNotificator {

    public void notifyClient(Client client) {
        System.out.printf(" \n Sr(a) %s, your profile was activated! \n", client.getName());
    }
}
