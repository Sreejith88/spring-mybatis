package com.qlearn.springmybatis.controller;

import com.qlearn.springmybatis.model.User;
import com.qlearn.springmybatis.service.UserService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/users/")
public class UserController {

    private UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping("all")
    public List<User> findAll()
    {
        return userService.findAll();
    }

    @PostMapping("/add")
    public List<User> addUser(@RequestParam String name, @RequestParam String salary)
    {
        this.userService.addUser(name, salary);
        return userService.findAll();
    }

    @PutMapping("/update")
    public List<User> updateUser(@RequestParam Integer id, @RequestParam String salary)
    {
        this.userService.updateUser(id, salary);
        return userService.findAll();
    }

    @DeleteMapping("/delete")
    public List<User> deleteUser(@RequestParam Integer id)
    {
        this.userService.deleteUser(id);
        return userService.findAll();
    }
}
