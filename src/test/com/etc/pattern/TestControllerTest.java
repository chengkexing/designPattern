package com.etc.pattern;

import lombok.extern.slf4j.Slf4j;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
@Slf4j
public class TestControllerTest{

    @Before
    public void before(){
        System.out.println("-------------测试类启动----------");
    }
    @After
    public void after(){
        System.out.println("-------------测试类运行完成----------");
    }


    @Test
    public void test(){
        System.out.println("--------------testInfo--------------");
    }
}