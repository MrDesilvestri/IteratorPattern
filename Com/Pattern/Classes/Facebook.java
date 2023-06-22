package Com.Pattern.Classes;
import java.util.ArrayList;
import java.util.List;

import Com.Pattern.Interfaces.ProfileIterator;
import Com.Pattern.Interfaces.SocialNetwork;
import Com.Pattern.Models.Profile;

public class Facebook implements SocialNetwork{

    List<Profile> profiles = new ArrayList<Profile>();

    @Override
    public ProfileIterator createFriendsIterator(String profileId) {
        // retorna el iterador para recorrer los amigos de un perfil
        return new FacebookIterator(this, profileId, "friends");
    }

    @Override
    public ProfileIterator createCoworkersIterator(String profileId) {
        // retorna el iterador para recorrer los compañeros de trabajo de un perfil
        return new FacebookIterator(this, profileId, "coworkers");
    }

    public Profile[] socialGraphRequest(String profileId, String type) {
        // Simula una solicitud al API de Facebook para obtener los amigos o compañeros de trabajo de un perfil
        if(type.equals("friends")){
            profiles.add(new Profile("1", "John", "jhon123friend@12345.com"));
            profiles.add(new Profile("2", "bruno", "bruno123@gmail.com"));
            profiles.add(new Profile("3", "carlos", "carlos123@gmail.com"));
            profiles.add(new Profile("4", "jhon", "jhon456@gmail.com"));
            return profiles.toArray(new Profile[profiles.size()]);
        }else if(type.equals("coworkers")){
            profiles.add(new Profile("1", "John", "jhon123coworker@12345.com"));
            profiles.add(new Profile("2", "bruno", "bruno123@gmail.com"));
            profiles.add(new Profile("3", "carlos", "carlos123@gmail.com"));
            profiles.add(new Profile("4", "jhon", "jhon456@gmail.com"));
            return profiles.toArray(new Profile[profiles.size()]);
        }
        else{
            return null;
        }
    }
}
