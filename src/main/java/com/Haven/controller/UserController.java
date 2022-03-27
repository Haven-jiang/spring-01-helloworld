package com.Haven.controller;

import com.Haven.pojo.User;
import com.Haven.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class UserController {

    @Autowired
    UserService userService;

    @PostMapping("/registerUser")
    public String registerUser(User user) {
        userService.insertUser(user);
        return "redirect:/main";
    }
}
