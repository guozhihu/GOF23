package com.zhihu.design.pattern.creational.singleton;

import java.io.Serializable;

/**
 * Author: zhihu
 * Description:使用静态内置类实现单例模式
 * Date: Create in  2018/12/20 23:56
 */
public class StaticInnerClassSingleton implements Serializable{
        private StaticInnerClassSingleton(){
                // 防止反射攻击
                if (InnerClass.singleton != null) {
                        throw new RuntimeException("单例构造器禁止反射调用");
                }
        }

        private static class InnerClass{
                private static StaticInnerClassSingleton singleton = new StaticInnerClassSingleton();
        }

        public static StaticInnerClassSingleton getInstance(){
                return InnerClass.singleton;
        }
}
