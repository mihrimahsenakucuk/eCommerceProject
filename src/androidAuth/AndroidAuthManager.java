package androidAuth;

import core.AuthService;
import entities.conretes.User;
import google.GoogleAuthManager;

public class AndroidAuthManager implements AuthService {

    GoogleAuthManager googleAuthManager;

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
