package com.wshuo.tservice.common.controller;

import com.wshuo.tservice.config.ServerProperties;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Slf4j
public class CommonController {
    
    @Autowired
    ServerProperties serverProperties;
    @Value("${server.name}")
    String serverName;
    
    @GetMapping("/getServerNameByValue")
    public String getServerNameByValue(){
        return serverName;
    }
    
    @GetMapping("/getServerNameByProperties")
    public String getServerNameByProperties(){
        return serverProperties.getName();
    }
}
