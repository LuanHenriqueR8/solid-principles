package di.problem.notificator;

import di.problem.models.Client;

public class SmsNotificator {

    public void notify(Client client) {
        System.out.printf("\n Sr(a) %s, your profile was activated! \n", client.getName());
    }
}
