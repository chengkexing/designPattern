package com.etc.pattern.core;

/**
 * 饿汉式 推荐(线程默认安全)
 * 优点：没有加锁，执行效率会提高。
 * 缺点：类加载时就初始化，浪费内存。
 * @author https://www.runoob.com/design-pattern/singleton-pattern.html
 */
public class SingleObject {
    //创建 SingleObject 的一个对象
    public static SingleObject instance = new SingleObject();
    //让构造函数为 private，这样该类就不会被实例化
    private SingleObject(){
    }
    //获取唯一可用的对象
    public static SingleObject getInstance(){
        return instance;
    }
    public void showMessage(){
        System.out.println("Hello World!");
    }
}
