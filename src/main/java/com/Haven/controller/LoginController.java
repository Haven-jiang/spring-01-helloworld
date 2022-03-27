package com.Haven.controller;

import com.Haven.pojo.User;
import com.Haven.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpSession;

@Controller
@RequestMapping("/user")
public class LoginController {

    @Autowired
    private UserService userService;

    @RequestMapping("login")
    public String login(@RequestParam("username") Integer id,
                        @RequestParam("password") String password,
                        Model model,
                        HttpSession session) {
        User user = userService.selectUserByIdAccurate(id);
        if (user == null) {
            model.addAttribute("loginMessage", "用户名不存在!");
            return "index";
        }
        else if (!user.getPassword().equals(password)) {
            model.addAttribute("loginMessage", "密码错误!");
            return "index";
        }
        else
            session.setAttribute("loginMessage", user.getUsername());
        return "redirect:/main";
    }
}
