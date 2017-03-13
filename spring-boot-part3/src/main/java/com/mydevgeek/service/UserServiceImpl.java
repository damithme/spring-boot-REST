package com.mydevgeek.service;

import com.mydevgeek.domain.User;
import com.mydevgeek.exception.ResourceNotFoundException;
import com.mydevgeek.repo.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by DAM on 3/1/17.
 */
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository userRepository;

    public User getUserById(Long id) {
        User user = userRepository.findOne(id);

        if (user == null) {
            throw new ResourceNotFoundException(id, "user not found");
        }
        return user;
    }

    public User createUser(User user) {
        return userRepository.save(user);
    }

    public User updateUser(User user) {
        return userRepository.save(user);
    }

    public void deleteUser(Long id) {
        User user = getUserById(id);
        if (user != null) {
            userRepository.delete(id);
        }
    }


}
