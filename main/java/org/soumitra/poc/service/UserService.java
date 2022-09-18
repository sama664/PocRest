package org.soumitra.poc.service;

import org.soumitra.poc.entity.Users;
import org.soumitra.poc.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

    @Autowired
    UserRepository userRepository;

    public void saveUsersList(Users users){
        userRepository.save(users);
    }
    public List<Users> allUserList(){
        return userRepository.findAll();
    }
}
