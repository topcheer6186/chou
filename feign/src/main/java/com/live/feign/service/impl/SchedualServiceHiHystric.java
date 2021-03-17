package com.live.feign.service.impl;

import com.live.feign.service.SchedualServiceHi;
import org.springframework.stereotype.Component;

/**
 * @author kongp
 * @create 2021-03-17
 **/
@Component
public class SchedualServiceHiHystric implements SchedualServiceHi {
    @Override
    public String sayHiFromClientOne(String name) {
        return "sorry " + name;
    }
}
