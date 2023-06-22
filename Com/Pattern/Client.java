package Com.Pattern;

import Com.Pattern.Classes.Application;
import Com.Pattern.Models.Profile;

public class Client {
    public static void main(String[] args){
        //es el cliente de prueba en el ejemplo de facebook (patron iterator)
        Application app = new Application();
        app.config();

        Profile profile = new Profile("1", "John", "jhon123@12345.com");


        app.sendSpamToFriends(profile, "Hello friends!");

        app.sendSpamToCoworkers(profile, "Hello coworkers!");
    }
}
