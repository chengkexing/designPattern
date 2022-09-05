package com.etc.pattern.core;

/**
 * 懒汉式(双重校验锁)
 * 优点：第一次调用才初始化，避免内存浪费。
 * 缺点：必须加锁 synchronized 才能保证单例，但加锁会影响效率。
 * @author https://www.runoob.com/design-pattern/singleton-pattern.html
 */
public class CheckLockSingleton {
    private volatile static CheckLockSingleton singleton;
    private CheckLockSingleton (){}
    public static CheckLockSingleton getCheckLockSingleton() {
        if (singleton == null) {
            synchronized (CheckLockSingleton.class) {
                if (singleton == null) {
                    singleton = new CheckLockSingleton();
                }
            }
        }
        return singleton;
    }
}
