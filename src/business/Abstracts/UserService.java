package business.Abstracts;

import entities.conretes.User;

public interface UserService {

    void register(User user);
    void login(User user);
    void confirm(User user);
    void registerWithAccount(User user);
    void deleteUser(User user);
    void loginWithAccount(User user);



}
