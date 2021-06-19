package core;

import entities.conretes.User;

public interface AuthService {

    void register(User user);
    void login(User user);

}
