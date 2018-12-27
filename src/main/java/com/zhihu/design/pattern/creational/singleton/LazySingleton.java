package com.zhihu.design.pattern.creational.singleton;

/**
 * Author: zhihu
 * Description:懒汉式
 * Date: Create in  2018/12/20 21:48
 */
public class LazySingleton {

        private static LazySingleton lazySingleton = null;

        private LazySingleton(){
                // 利用下面这种方式无法解决懒加载方式实现的单例模式不被反射攻击，只有当第一次实例化该类的对象的线程不是使用反射攻击的线程才可以保证该方式有效
                if (lazySingleton != null) {
                        throw new RuntimeException("单例构造器禁止反射调用");
                }
        }

        public synchronized static LazySingleton getInstance(){
                if (lazySingleton == null) {
                        lazySingleton = new LazySingleton();
                }
                return lazySingleton;
        }
}
