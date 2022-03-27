package com.Haven.controller;

import com.Haven.mapper.EmployeeMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class EmployeeController {

    @Autowired
    EmployeeMapper employeeMapper;

    @RequestMapping("/emps")
    public String list(Model model) {
        model.addAttribute("emps", employeeMapper.getAll());
        return "emp/list";
    }
}
