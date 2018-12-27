package com.zhihu.design.pattern.creational.singleton;

/**
 * Author: zhihu
 * Description:双重检测锁延迟加载机制实现单例模式
 * Date: Create in  2018/12/20 22:30
 */
public class LazyDoubleCheckSingleton {

        private volatile static LazyDoubleCheckSingleton singleton = null;

        private LazyDoubleCheckSingleton(){}

        public static LazyDoubleCheckSingleton getInstance(){
                if (singleton == null) {
                        synchronized (LazyDoubleCheckSingleton.class){
                                if (singleton == null) {
                                        singleton = new LazyDoubleCheckSingleton();
                                }
                        }
                }
                return singleton;
        }
}
