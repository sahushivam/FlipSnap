package repository;

import models.User;

public interface UserRepo {

    User findById(String id);
    User saveUser(String userName);
}
