package business.Concretes;

import business.Abstracts.UserService;
import core.AuthService;
import dataAccess.abstracts.UserDao;
import entities.conretes.User;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserManager implements UserService {


        private UserDao userDao;
        private AuthService authService;


        public UserManager(UserDao userDao, AuthService authService) {
            this.userDao = userDao;
            this.authService = authService;
        }


        @Override
        public void register(User user) {

            if (user.getPassword().length() < 6) {
                System.out.println("Şifreniz en az 6 karakterden oluşmalıdır.");
            }

            final String EMAIL_PATTERN = "^[A-Z0-9._%+-]+@[A-Z0-9.-]+.(com|org|net|edu|gov|mil|biz|info|mobi)(.[A-Z]{2})?$";
            final Pattern pattern = Pattern.compile(EMAIL_PATTERN);
            Matcher matcher = pattern.matcher(user.getEmail());

            //uyuyo mu diye bakıyor
            if (!matcher.matches()) {
                System.out.println(user.getEmail() + "E-posta formatına uygun değil!");
            }

            for (User user1 : userDao.getAll()) {
                if (user1.getEmail().equals(user1.getEmail())) {
                    System.out.println(user1.getEmail() + "Bu e-posta sistemde mevcutt.");
                }
            }

            if (user.getName().length() < 2 && user.getSurname().length() < 2) {
                System.out.println("Ad ve soyad en az iki karakterden oluşmalıdır.");
            }

        }

        @Override
        public void login(User user) {
            if (user.isVerify() == true) {
                //userDao.login(user);

            } else {
                System.out.println("Giriş başarısız. E-mail adresinizi kontrol ediniz.");

            }
        }

        @Override
        public void confirm(User user) {
            if (user.isVerify() == true) {

                //userDao.confirm(user);
                System.out.println("Sayın " + user.getName() + " " + " e-posta adresi doğrulanmıştır.");


            } else {

                System.out.println("Sayın " + user.getName() + " " + " e-posta adresi doğrulanmamıştır.");

            }


        }

    @Override
    public void registerWithAccount(User user) {

    }

    @Override
    public void deleteUser(User user) {

    }

    @Override
    public void loginWithAccount(User user) {

    }


}
