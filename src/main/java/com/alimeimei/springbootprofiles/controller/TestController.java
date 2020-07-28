package com.alimeimei.springbootprofiles.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by PengWX on 2020/7/28.
 */
@RestController
@RequestMapping("test")
public class TestController {

    @Value("${server.port}")
    private String serverPort;

    @RequestMapping("testProfile")
    public String testProfile(){
        System.out.println(serverPort);
        return serverPort;
    }
}
