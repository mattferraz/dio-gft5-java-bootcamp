import java.time.LocalTime;

public class Message {

    public static void showWelcomeMessage() {
        final int currentHour = LocalTime.now().getHour();

        if (currentHour < 12) {
            System.out.println("Bom dia!");
        }

        else if (currentHour < 18) {
            System.out.println("Boa tarde!");
        }

        // if currentHour is between 18h and 24h:
        else {
            System.out.println("Boa noite!");
        }
    }

}
