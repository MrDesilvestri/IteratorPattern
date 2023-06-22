package Com.Pattern.Classes;

import Com.Pattern.Interfaces.ProfileIterator;
import Com.Pattern.Models.Profile;

public class FacebookIterator implements ProfileIterator{
    private Facebook facebook;
    private String profileId;
    private String type;

    private int currentPosition = 0;
    private Profile[] cache;
    
    public FacebookIterator(Facebook facebook, String profileId, String type) {
        this.facebook = facebook;
        this.profileId = profileId;
        this.type = type;
    }

    private void lazyLoad() {
        //si el cache es nulo, se carga el cache con los perfiles de facebook
        if (cache == null) {
            cache = facebook.socialGraphRequest(profileId, type);
        }
    }

    @Override
    public boolean hasMore() {
        //verifica si hay mas perfiles en el cache
        lazyLoad();
        return currentPosition < cache.length;
    }

    @Override
    public Profile getNext() {
        //retorna el siguiente perfil del cache
        if (hasMore()) {
            return cache[currentPosition++];
        }
        return null;
    }

    

    
    
}
