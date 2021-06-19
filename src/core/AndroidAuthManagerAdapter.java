package core;

import androidAuth.AndroidAuthManager;
import entities.conretes.User;
import google.GoogleAuthManager;


public class AndroidAuthManagerAdapter implements AuthService {


    GoogleAuthManager googleAuthManager;

    public AndroidAuthManagerAdapter(AndroidAuthManager androidAuthManager) {
    }

    public void GoogleAuthManagerAdapter(GoogleAuthManager googleAuthManager) {
        this.googleAuthManager = googleAuthManager;
    }

    @Override
    public void register(User user) {
        googleAuthManager.register(user);
    }

    @Override
    public void login(User user) {
        googleAuthManager.login(user);
    }



}
