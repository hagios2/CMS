package com.example.accessingdatamysql.Services;

import com.example.accessingdatamysql.Models.User;
import com.example.accessingdatamysql.Repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Optional;

@Service
public class UserService {

//    @Override
//    public UserDetails loadUserByUsername(String userName) throws UsernameNotFoundException
//    {
//        return (UserDetails) new User("John", "john@gmail.com", "233203665258", "123456");
//    }

   private final UserRepository userRepository;

    @Autowired
    public UserService(UserRepository userRepository)
    {
        this.userRepository = userRepository;
    }

    public String createUser(String name, String email, String phone, String password)
    {
        User user = new User();
        user.setName(name);
        user.setEmail(email);
        user.setPassword(password);
        user.setPhone(phone);
        userRepository.save(user);

        return "User created";
    }

    public void addNewUser(User user)
    {
        Optional<User> userByEmail = userRepository.findUserByEmail(user.getEmail());

        if(userByEmail.isPresent())
        {
            throw new IllegalStateException("Email already taken");
        }

        userRepository.save(user);
    }

    public Iterable<User> fetchAllUsers()
    {
        return userRepository.findAll();
    }


    public String userDelete(Integer user_id)
    {
        boolean exists = userRepository.existsById(user_id);

        if(!exists){
            throw new IllegalStateException("Not found");
        }

        userRepository.deleteById(user_id);

        return "user has been deleted";
    }

    public String userUpdate(int user_id)
    {
//        User user = userRepository.findById(user_id);
//
//        if(!exist)
//        {
//            throw new IllegalStateException("Not found");
//        }



        return "user has been updated";
    }

    public Optional<User> fetchUser(Integer user_id)
    {
        return userRepository.findById(user_id);
    }
}
