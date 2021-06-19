import androidAuth.AndroidAuthManager;
import business.Abstracts.UserService;
import business.Concretes.UserManager;
import core.AndroidAuthManagerAdapter;
import dataAccess.concretes.HibernateUserDao;
import entities.conretes.User;

public class Main {

    public static void main(String[] args) {

        UserService userService = new UserManager(new HibernateUserDao(), new AndroidAuthManagerAdapter(new AndroidAuthManager()));

        User user1 = new User("Mihrimah", "Kucuk", "mihrimahkucuk@gmail.com", "123456", true);
        User user2 = new User("Sena", "Kucuk", "senakucuk@gmail.com", "654321", true);

        userService.register(user1);
        userService.login(user1);
        userService.confirm(user1);
        userService.registerWithAccount(user2);
        userService.loginWithAccount(user2);

    }
}