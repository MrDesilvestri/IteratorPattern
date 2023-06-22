package Com.Pattern.Classes;

import Com.Pattern.Interfaces.ProfileIterator;
import Com.Pattern.Models.Profile;

public class SocialSpammer {
    public void send(ProfileIterator iterator, String message) {
        //va iterando en el arreglo de perfiles y va enviando el mensaje
        while (iterator.hasMore()) {
            Profile profile = iterator.getNext();
            System.out.println("Sending message to: " + profile.getName());
            System.out.println("Email: " + profile.getEmail());
            System.out.println("Message: " + message);
        }
    }
}
