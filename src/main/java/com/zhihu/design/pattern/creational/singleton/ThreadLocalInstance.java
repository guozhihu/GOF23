package com.zhihu.design.pattern.creational.singleton;

/**
 * Author: zhihu
 * Description:ThreadLocal线程单例，不能保证整个应用全局为单例，但能保证在线程内为单例
 * Date: Create in 2018/12/22 8:35
 */
public class ThreadLocalInstance {
    
    private static final ThreadLocal<ThreadLocalInstance> threadLocalInstanceThreadLocal
        = new ThreadLocal<ThreadLocalInstance>(){
        @Override
        protected ThreadLocalInstance initialValue() {
            return new ThreadLocalInstance();
        }
    };
    
    private ThreadLocalInstance(){}
    
    public static ThreadLocalInstance getInstance(){
        return threadLocalInstanceThreadLocal.get();
    }
}
