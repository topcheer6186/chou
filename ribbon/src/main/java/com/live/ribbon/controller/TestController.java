package com.live.ribbon.controller;

import com.live.ribbon.service.HelloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author kongp
 * @create 2021-03-12
 **/
@RestController
public class TestController {

    @Autowired
    private HelloService helloService;

    @GetMapping("hi")
    public String home(@RequestParam String name) {
        return helloService.hiService(name);
    }
}
