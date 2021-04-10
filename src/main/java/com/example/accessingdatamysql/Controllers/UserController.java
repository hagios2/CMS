package com.example.accessingdatamysql.Controllers;

import com.example.accessingdatamysql.Models.User;
import com.example.accessingdatamysql.Services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
//@CrossOrigin(origins = "*")
@RequestMapping(path="/api")
public class UserController
{

    private final UserService userService;

    @Autowired
    public UserController(UserService userService)
    {
        this.userService = userService;
    }

    @PostMapping(path="/user/create")
    public @ResponseBody
    String addNewUser (@RequestParam String name, @RequestParam String email, @RequestParam String phone, @RequestParam String password)
    {
       return this.userService.createUser(name, email, password, phone);
    }

    @PostMapping(path="/user/create")
    public void registerNewStudent(User user)
    {
        this.userService.addNewUser(user);
    }

    @GetMapping(path="get/users")
    public @ResponseBody Iterable<User> getAllUsers()
    {
        return this.userService.fetchAllUsers();
    }

    @GetMapping(path="get/{user_id}/users")
    public @ResponseBody
    Optional <User> getUser(@PathVariable("user_id") Integer user_id)
    {
        return this.userService.fetchUser(user_id);
    }

    @DeleteMapping(path="delete/{user_id}/user")
    public String deleteUser(@PathVariable("{user_id}") Integer user_id)
    {
        return this.userService.userDelete(user_id);
    }

    @PutMapping(path = "update/{user_id}/user")
    public String updateUser(@PathVariable("user_id") Integer user_id, @RequestParam(required = false) String name, @RequestParam(required = true) String email)
    {
        return "";
    }
}
