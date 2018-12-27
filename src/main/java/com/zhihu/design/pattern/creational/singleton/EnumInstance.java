package com.zhihu.design.pattern.creational.singleton;

/**
 * Author: zhihu
 * Description:枚举实现单例模式
 * 枚举类实现的单例模式是线程安全的，无法通过序列化和反射破坏
 * Date: Create in  2018/12/21 22:22
 */
public enum EnumInstance {
    INSTANCE {
        protected void printTest() {
            System.out.println("Print Client");
        }
    };
    
    protected abstract void printTest();
    
    private Object data;
    
    public Object getData() {
        return data;
    }
    
    public void setData(Object data) {
        this.data = data;
    }
    
    public static EnumInstance getInstance() {
        return INSTANCE;
    }
}
