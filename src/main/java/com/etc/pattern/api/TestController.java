package com.etc.pattern.api;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController("/test")
public class TestController {

    @GetMapping
    public String test(String testStr) {
        System.out.println(testStr);
        return "测试成功";
    }


}
