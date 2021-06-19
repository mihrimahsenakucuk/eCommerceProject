package dataAccess.abstracts;

public interface UserDao {

    void register(User user);
    void login(User user);
    void confirm(User user);

    List<User> getAll();
    void signIn(Object user);



}
