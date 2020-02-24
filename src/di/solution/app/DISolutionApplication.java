package di.solution.app;

import di.solution.notificator.EmailNotificator;
import di.solution.notificator.SmsNotificator;
import di.solution.models.Client;
import di.solution.service.ClientActivator;

public class DISolutionApplication {

    public static void main(String[] args) {
        Client client1 = new Client("John");
        Client client2 = new Client("Mary");

        // just choose one notifier
        EmailNotificator emailNotificator = new EmailNotificator();
//        SmsNotificator smsNotificator = new SmsNotificator();

        ClientActivator clientActivator = new ClientActivator(emailNotificator);
        clientActivator.activeClient(client1);
        clientActivator.activeClient(client2);
    }
}
