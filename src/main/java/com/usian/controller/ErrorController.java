package com.usian.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class ErrorController {
    @Autowired
    JavaMailSender jms;

    @RequestMapping("/show")
    public String showInfo(){
        String str = null;
        str.length();
        return "index";
    }

    @RequestMapping("/show2")
    public String showInfo2(){
        int a = 10/0;
        return "index";
    }


    @GetMapping("/send")
    public String send(){
        //建立邮件消息
        SimpleMailMessage mainMessage = new SimpleMailMessage();
        //发送者
        mainMessage.setFrom("1976178211@qq.com");
        //接收者
        mainMessage.setTo("2440749975@qq.com");
        //发送的标题
        mainMessage.setSubject("嗨喽");
        //发送的内容
        mainMessage.setText("hello world");
        jms.send(mainMessage);
        return "1";
    }

    @GetMapping("/hello")
    @ResponseBody
    public String hello(){

        return "hello";
    }

}
