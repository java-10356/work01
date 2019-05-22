package com.coder520.user.controller;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import com.coder520.pojo.User;

@Controller
@RequestMapping("user")
public class UserController {

    @RequestMapping("login")
    @ResponseBody
    public String getLogin(Model model, @PathVariable int id){
//        if(user!=null){
//            String name = user.getName();
//            return name;
//        }else{
//            return "wei null";
//        }
        return id+"";

    }
}
