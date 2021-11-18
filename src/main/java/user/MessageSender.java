package user;

public class MessageSender {
    public boolean send(String text, User user, String country) {
        boolean isSameCountry = user.getCountry().equals(country);
        if (isSameCountry) {
            System.out.println("Message was sent: " + text);
        }

        return isSameCountry;
    }
}
