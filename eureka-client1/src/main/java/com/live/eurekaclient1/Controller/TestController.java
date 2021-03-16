package com.live.eurekaclient1.Controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author kongp
 * @create 2021-03-12
 **/
@RestController
public class TestController {

    @Value("${server.port}")
    private String port;

    @GetMapping("/hi")
    public String home(@RequestParam(value = "name", defaultValue = "chouchou") String name) {
        return "hi " + name + " ,i am from port:" + port;
    }

}
