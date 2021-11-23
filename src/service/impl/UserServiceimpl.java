package service.impl;

import repository.UserRepo;
import repository.impl.InMemoryUserRepoImpl;
import service.UserService;

public class UserServiceimpl implements UserService {

    UserRepo userRepo;

    @Override
    public void insertUser(String username) {
        if(userRepo == null) {
            userRepo = new InMemoryUserRepoImpl();
        }
        userRepo.saveUser(username);
    }

}
