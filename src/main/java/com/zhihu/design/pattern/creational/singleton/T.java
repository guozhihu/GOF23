package com.zhihu.design.pattern.creational.singleton;

/**
 * Author: zhihu
 * Description:
 * Date: Create in  2018/12/20 22:01
 */
public class T implements Runnable {
    @Override
    public void run() {
//        LazySingleton instance = LazySingleton.getInstance();

//        ContainerSingleton.putInstance("object", new Object());
//        Object instance = ContainerSingleton.getInstance("object");
        
        ThreadLocalInstance instance = ThreadLocalInstance.getInstance();
        System.out.println(Thread.currentThread().getName() + " : " + instance);
    }
}
