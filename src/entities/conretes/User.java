package entities.conretes;

import entities.abstracts.Entity;

public class User implements Entity {

    private String name;
    private String surname;
    private String email;
    private String password;
    private boolean verify; // doğrulama methodu çağırmak için


    public User(String name, String surname, String email, String password, boolean verify) {
        super();
        this.name = name;
        this.surname = surname;
        this.email = email;
        this.password = password;
        this.verify = verify;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getSurname() {
        return surname;
    }
    public void setSurname(String surname) {
        this.surname = surname;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public String getPassword() {
        return password;
    }
    public void setPassword(String password) {
        this.password = password;
    }
    public boolean isVerify() {
        return verify;
    }
    public void setVerify(boolean verify) {
        this.verify = verify;
    }

    public void add(User user) {

    }



}
