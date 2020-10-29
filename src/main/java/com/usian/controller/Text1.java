package com.usian.controller;

import com.usian.Application;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

    @RunWith(SpringJUnit4ClassRunner.class)
    @SpringBootTest(classes={Application.class})
    public class Text1 {
        @Autowired
        private JavaMailSender mailSender;

        @Test
        public void sendSimpleMail(){
            SimpleMailMessage message = new SimpleMailMessage();
            message.setFrom("1976178211@qq.com");
            message.setTo("2440749975@qq.com");
            message.setSubject("这是标题");
            message.setText("这是内容");
            System.out.println(message);
            mailSender.send(message);
        }
    }

