package com.etc.pattern;

import com.etc.pattern.core.PersonFactory;
import com.etc.pattern.enums.PersonEnum;
import com.etc.pattern.pojo.Person;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.junit4.SpringRunner;


@RunWith(SpringRunner.class)
public class PersonFactoryTest {

    private Long startTime;
    private Long endTime;

    @Before
    public void setUp() {
        startTime = System.currentTimeMillis();
        System.out.println("---------------------------测试工厂模式--------------------------");
    }

    @Test
    public void test() throws Exception {
        Person man = PersonFactory.generator(PersonEnum.MAN);
        Person man2 = PersonFactory.generator(PersonEnum.MAN);
        Person woman = PersonFactory.generator(PersonEnum.WOMAN);
        Person woman2 = PersonFactory.generator(PersonEnum.WOMAN);

        man.talking();
        man2.talking();
        woman.talking();
        woman2.talking();
    }

    @After
    public void after(){
        endTime = System.currentTimeMillis();
        System.out.println("---------------------------测试工厂模式--------------------------");
        System.out.println("运行时间"+(endTime - startTime)+"ms");
    }
}
