package com.offcn.spring.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpSession;

@RestController
public class MyController {

    @GetMapping("/setSession")
    public String setSession(HttpSession session){
        session.setAttribute("msg","this is a session");
        return "ok";
    }

    @GetMapping("/getSession")
    public String getSession(HttpSession session){
        return (String)session.getAttribute("msg");
    }
}
