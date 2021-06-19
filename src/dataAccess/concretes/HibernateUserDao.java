package dataAccess.concretes;

import dataAccess.abstracts.UserDao;
import entities.conretes.User;

public class HibernateUserDao implements UserDao {
    List<User>user= new ArrayList<User>();


    @Override
    public void register(User user) {
        System.out.println(user.getName() + "isimli kullanıcı başarıyla oluşturuldu.");
        user.add(user);
    }

    @Override
    public void login(User user) {
        System.out.println(user.getName() + "adlı kullanıcı eklendi.");
    }

    @Override
    public void confirm(User user) {
        System.out.println(user.getEmail() + "adlı kullanıcı giriş yaptı.");
    }

    @Override
    public List<User> getAll() {
        return this.user;
    }

    @Override
    public void signIn(Object user) {

    }







}
