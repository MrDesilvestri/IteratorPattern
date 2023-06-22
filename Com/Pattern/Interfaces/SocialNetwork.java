package Com.Pattern.Interfaces;

public interface SocialNetwork {
    //interface para crear los iteradores de amigos y compañeros de trabajo
    public ProfileIterator createFriendsIterator(String profileId);
    public ProfileIterator createCoworkersIterator(String profileId);
}
