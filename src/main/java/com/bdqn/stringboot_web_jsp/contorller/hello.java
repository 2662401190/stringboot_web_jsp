package com.bdqn.stringboot_web_jsp.contorller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.Mapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.swing.*;
import javax.xml.transform.Source;

/**
 * @author 贺威
 * @create 2018-12-02 13:26
 */
@Controller
public class hello {

    @GetMapping("/sd")
    public String hello(){
        System.out.println("进来");

        return "success";
    }

    @PostMapping("/hello")
    public String sd(){

        return "success";
    }

}
