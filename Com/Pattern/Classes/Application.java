package Com.Pattern.Classes;
import Com.Pattern.Interfaces.ProfileIterator;
import Com.Pattern.Interfaces.SocialNetwork;
import Com.Pattern.Models.Profile;

public class Application {
    
    SocialNetwork network;
    SocialSpammer spammer;
    

    

    public void config() {
        //configura la red social y el spammer
        network = new Facebook();
        spammer = new SocialSpammer();
    }

    

    public void sendSpamToFriends(Profile profile, String message) {
        //envia el mensaje a los amigos del perfil
        System.out.println("Sending spam to friends...");
        ProfileIterator iterator = network.createFriendsIterator(profile.getId());
        spammer.send(iterator, message);
    }

    public void sendSpamToCoworkers(Profile profile, String message) {
        //envia el mensaje a los compañeros de trabajo del perfil
        System.out.println("Sending spam to coworkers...");
        ProfileIterator iterator = network.createCoworkersIterator(profile.getId());
        spammer.send(iterator, message);
    }
}
