package com.etc.pattern.core;

/**
 * 懒汉登记式(线程安全)
 * 这种方式比较有特点，好处是我们将初始化过程放在内部类中，这样在类装载过程中不会实例化该类
 * 当类被主动使用时才会进行实例化 达到一种效果使用饿汉式的方式实现懒汉式的过程
 */
public class RegisterSingleton {
    /**
     * 内部登记类
      */
    private static class SingletonHolder {
        private static final RegisterSingleton INSTANCE = new RegisterSingleton();
    }

    /**
     * 私有化构造方法
     */
    private RegisterSingleton(){}

    //示例调用
    public static final RegisterSingleton getInstance() {
        return SingletonHolder.INSTANCE;
    }
}
