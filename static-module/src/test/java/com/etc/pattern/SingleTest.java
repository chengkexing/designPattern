package com.etc.pattern;

import cn.hutool.core.util.StrUtil;
import com.etc.pattern.core.*;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
public class SingleTest {
    private Long startTime;
    private Long endTime;

    @Before
    public void setUp() {
        startTime = System.currentTimeMillis();
        System.out.println("---------------------------测试单例模式--------------------------");
    }

    @Test
    public void test() throws Exception {
        CheckLockSingleton single1 = CheckLockSingleton.getCheckLockSingleton();
        CheckLockSingleton single2 = CheckLockSingleton.getCheckLockSingleton();
        System.out.println(StrUtil.format("hashCode {} {}",single1.hashCode(),single2.hashCode()));
        Assert.assertEquals(single1,single2);
    }
    @Test
    public void test2() throws Exception {
        RegisterSingleton instance = RegisterSingleton.getInstance();
        RegisterSingleton instance2 = RegisterSingleton.getInstance();
        System.out.println(StrUtil.format("hashCode {} {}",instance.hashCode(),instance2.hashCode()));
        Assert.assertEquals(instance,instance2);
    }
    @Test
    public void test3() throws Exception {
        SingleObject instance = SingleObject.getInstance();
        SingleObject instance2 = SingleObject.getInstance();
        System.out.println(StrUtil.format("hashCode {} {}",instance.hashCode(),instance2.hashCode()));
        Assert.assertEquals(instance,instance2);
    }
    @Test
    public void test4() throws Exception {
        Singleton instance = Singleton.getInstance();
        Singleton instance2 = Singleton.getInstance();
        System.out.println(StrUtil.format("hashCode {} {}",instance.hashCode(),instance2.hashCode()));
        Assert.assertEquals(instance,instance2);
    }

    @After
    public void after(){
        endTime = System.currentTimeMillis();
        System.out.println("---------------------------测试单例模式--------------------------");
        System.out.println("运行时间"+(endTime - startTime)+"ms");
    }

}
