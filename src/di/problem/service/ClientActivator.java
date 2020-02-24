package di.problem.service;

import di.problem.models.Client;
import di.problem.notificator.EmailNotificator;
import di.problem.notificator.SmsNotificator;

public class ClientActivator {

    public void activeClient(Client client) {
        client.setActive(true);

        // notify client by email
        EmailNotificator emailNotificator = new EmailNotificator();
        emailNotificator.notifyClient(client);

        // notify client by sms
//        SmsNotificator smsNotificator = new SmsNotificator();
//        smsNotificator.notify();
    }
}
