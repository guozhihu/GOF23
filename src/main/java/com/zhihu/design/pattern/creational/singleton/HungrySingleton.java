package com.zhihu.design.pattern.creational.singleton;

import java.io.Serializable;

/**
 * Author: zhihu
 * Description:饿汉式
 * Date: Create in  2018/12/21 13:19
 */
public class HungrySingleton implements Serializable, Cloneable{

        private final static HungrySingleton singleton;

        static {
                singleton = new HungrySingleton();
        }

        private HungrySingleton(){
                /**
                 * 解决反射攻击
                 */
                if (singleton != null) {
                        throw new RuntimeException("单例构造器禁止反射调用");
                }
        }

        public static HungrySingleton getInstance(){
                return singleton;
        }

        /**
         * 防止序列化破坏单例
         * @return
         */
        private Object readResolve(){
                return singleton;
        }
        
        /**
         * 防止原型模式破坏单例模式
         * @return
         * @throws CloneNotSupportedException
         */
        @Override
        protected Object clone() throws CloneNotSupportedException {
                /**
                 * 这种克隆方式会破坏单例模式
                 */
                //return super.clone();
        
                /**
                 * 防止克隆破坏单例模式
                 */
                return singleton;
        }
}
