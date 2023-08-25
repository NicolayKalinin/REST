package ru.netology.Authorization_service;


import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


@Component
public class UserRepository {

    List<User> userRepository;

    public UserRepository() {
        userRepository = Arrays.asList(new User("Nickolay", "112"),
                new User("Viacheslav", "254"),
                new User("Mama", "2345654"));
    }

    public List<Authorities> getUserAuthorities(String login, String password) {

        for (User user : userRepository) {
            if (user.getLogin().equals(login) && user.getPassword().equals(password)) {
                return Arrays.asList(Authorities.values());
            }
        }
        return new ArrayList<>();
    }
}