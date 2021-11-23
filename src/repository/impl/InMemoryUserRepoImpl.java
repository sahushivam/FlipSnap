package repository.impl;

import models.User;
import repository.UserRepo;

import java.util.HashMap;

public class InMemoryUserRepoImpl implements UserRepo {

    HashMap<String, User> userNametoUserMap;

    @Override
    public User findById(String id) {
        return userNametoUserMap.get(id);
    }

    @Override
    public User saveUser(String userName) {
        User user = new User(userName);
        userNametoUserMap.put(userName,user);
        return user;
    }
}
