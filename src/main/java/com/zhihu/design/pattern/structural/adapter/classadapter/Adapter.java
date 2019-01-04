package com.zhihu.design.pattern.structural.adapter.classadapter;

/**
 * Author: zhihu
 * Description:
 * Date: Create in 2019/1/4 9:25
 */
public class Adapter extends Adaptee implements Target {
    @Override
    public void request() {
        // 相关的业务逻辑
        super.adapteeRequest();
        // 相关的业务逻辑
    }
}
