package com.baizhi.lpm.controller;

import com.baizhi.lpm.entity.User;
import com.baizhi.lpm.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpSession;
import java.util.List;

@RestController
@RequestMapping("user")
public class UserController {
    @Autowired
    private UserService userService;
        @RequestMapping("queryAll")
    public List<User> queryAll(HttpSession session) {
        List<User> list = userService.queryAll();
        session.setAttribute("list", list);
        for (User user : list) {
            System.out.println(user);
        }
        return list;
    }
//    @RequestMapping("queryAll")
//    public String queryAll(HttpSession session) {
//        List<User> list = userService.queryAll();
//        session.setAttribute("list", list);
//        for (User user : list) {
//            System.out.println(user);
//        }
//        return "ShowAllView";
//    }
//    @RequestMapping("insertUser")
//    public String insertUser(User user) {
//        userService.insertUser(user);
//        return "redirect:/user/queryAll";
//    }
//    @RequestMapping("deleteUser")
//    public String deleteUser(Integer id) {
//        userService.deleteUser(id);
//        return "redirect:/user/queryAll";
//    }
//    @RequestMapping("queryById")
//    public String queryById(Integer id, HttpSession session) {
//        User user = userService.queryById(id);
//        session.setAttribute("user",user);
//        return "update";
//    }
//    @RequestMapping("updateUser")
//    public String updateUser(User user) {
//        userService.updateUser(user);
//        return "redirect:/user/queryAll";
//    }
}
