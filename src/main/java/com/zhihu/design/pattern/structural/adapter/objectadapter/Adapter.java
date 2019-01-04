package com.zhihu.design.pattern.structural.adapter.objectadapter;

/**
 * Author: zhihu
 * Description:
 * Date: Create in 2019/1/4 9:49
 */
public class Adapter implements Target {
    
    private Adaptee adaptee = new Adaptee();
    @Override
    public void request() {
        // 相关的业务逻辑
        adaptee.adapteeRequest();
        // 相关的业务逻辑
    }
}
