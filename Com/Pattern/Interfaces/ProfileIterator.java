package Com.Pattern.Interfaces;

import Com.Pattern.Models.Profile;

//interface para poder definir los metodos que se van a utilizar en el iterador
public interface ProfileIterator {
    public boolean hasMore();
    public Profile getNext();
}