package com.usian.config;

import com.usian.controller.ErrorController;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class LogTest {

    private Logger logger = LoggerFactory.getLogger(ErrorController.class);


    public String hello(){
        logger.info("==============hello==================");
        // xxxxx
        return "hello";
    }
}