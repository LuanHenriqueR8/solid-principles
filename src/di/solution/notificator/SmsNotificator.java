package di.solution.notificator;

import di.solution.models.Client;

public class SmsNotificator implements Notifier {

    @Override
    public void notifyClient(Client client) {
        System.out.printf("\n Sr(a) %s, your profile was activated! \n", client.getName());
    }
}
