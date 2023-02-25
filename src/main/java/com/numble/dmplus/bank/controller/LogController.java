package com.numble.dmplus.bank.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LogController {

    private final Logger logger = LoggerFactory.getLogger("LoggerController 로그");

    @GetMapping("/log")
    private String logtest()
    {
        logger.info("로그발생");
        return "logtest";
    }



}
