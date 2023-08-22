package ru.netology.profile;

import java.util.List;

public class UserRepository {
    private final List<Authorities> getUserAuthorities;

    public UserRepository(List<Authorities> getUserAuthorities) {
        String User = "Николай";
        String password = "Пароль";
        this.getUserAuthorities = getUserAuthorities;
    }


    public List<Authorities> getUserAuthorities(String user, String password) {
        return this.getUserAuthorities;
    }
}