package google;

import entities.conretes.User;

public class GoogleAuthManager {

    public void register(User user) {
        System.out.println("Sayın " + user.getName() + " " + user.getSurname() + " Google hesabı ile kayıt olundu.");
    }

    public void login(User user) {
        System.out.println("Sayın " + user.getName() + " " + user.getSurname() + " Google hesabı ile giriş yapıldı.");

    }


}
