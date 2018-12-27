package com.zhihu.design.pattern.creational.singleton;

import com.google.common.io.FileBackedOutputStream;

import java.io.*;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

/**
 * Author: zhihu
 * Description:
 * Date: Create in  2018/12/20 21:57
 */
public class Client {
    
    public static void main(String[] args) throws IOException, ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException {
    
        System.out.println(Thread.currentThread().getName() + " : " + ThreadLocalInstance.getInstance());
        System.out.println(Thread.currentThread().getName() + " : " + ThreadLocalInstance.getInstance());
        System.out.println(Thread.currentThread().getName() + " : " + ThreadLocalInstance.getInstance());
        Thread t1 = new Thread(new T());
        Thread t2 = new Thread(new T());
        t1.start();
        t2.start();
        System.out.println("program end");
        
        /**
         * 序列化破坏单例模式
         */
//        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("singleton_file"));
//        HungrySingleton singleton = HungrySingleton.getInstance();
//        oos.writeObject(singleton);
//        oos.close();
//
//        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("singleton_file"));
//        HungrySingleton newsingleton = (HungrySingleton) ois.readObject();
//        ois.close();
//
//        System.out.println(singleton);
//        System.out.println(newsingleton);
//        System.out.println(singleton == newsingleton);
        
        /**
         *  反射攻击
         */
//        Class objectClass = HungrySingleton.class;
//        Constructor constructor = objectClass.getDeclaredConstructor();
//        constructor.setAccessible(true);
//        HungrySingleton singleton = HungrySingleton.getInstance();
//        HungrySingleton newsingleton = (HungrySingleton) constructor.newInstance();
//        System.out.println(singleton);
//        System.out.println(newsingleton);
//        System.out.println(singleton == newsingleton);
//
//        Class objectClass = StaticInnerClassSingleton.class;
//        Constructor constructor = objectClass.getDeclaredConstructor();
//        constructor.setAccessible(true);
//        StaticInnerClassSingleton newsingleton = (StaticInnerClassSingleton) constructor.newInstance();
//        StaticInnerClassSingleton singleton = StaticInnerClassSingleton.getInstance();
//        System.out.println(singleton);
//        System.out.println(newsingleton);
//        System.out.println(singleton == newsingleton);
//
//        Class objectClass = LazySingleton.class;
//        Constructor constructor = objectClass.getDeclaredConstructor();
//        constructor.setAccessible(true);
//        // 下面这两行代码调换位置就无法保证单例
//        LazySingleton singleton = LazySingleton.getInstance();
//        LazySingleton lazySingleton = (LazySingleton) constructor.newInstance();
//
//        System.out.println(lazySingleton);
//        System.out.println(singleton);
//        System.out.println(lazySingleton == singleton);
    
        /**
         * 通过枚举实现的单例模式不会被序列化破坏
         */
//        EnumInstance enumInstance = EnumInstance.getInstance();
//        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("singleton_file"));
//        oos.writeObject(enumInstance);
//        oos.close();
//        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("singleton_file"));
//        EnumInstance newInstance = (EnumInstance) ois.readObject();
//        ois.close();
//        System.out.println(enumInstance);
//        System.out.println(newInstance);
//        System.out.println(enumInstance == newInstance);
    
//        EnumInstance enumInstance = EnumInstance.getInstance();
//        enumInstance.setData(new Object());
//        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("singleton_file"));
//        oos.writeObject(enumInstance);
//        oos.close();
//        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("singleton_file"));
//        EnumInstance newInstance = (EnumInstance) ois.readObject();
//        ois.close();
//        System.out.println(enumInstance.getData());
//        System.out.println(newInstance.getData());
//        System.out.println(enumInstance.getData() == newInstance.getData());
    
        /**
         * 通过枚举实现的单例模式不会被反射攻击
         */
//        Class objectClass = EnumInstance.class;
//        Constructor constructor = objectClass.getDeclaredConstructor(String.class, int.class);
//        constructor.setAccessible(true);
//        EnumInstance enumInstance = (EnumInstance) constructor.newInstance("zhihu", 666);
    }
}
