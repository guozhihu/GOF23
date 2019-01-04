package com.zhihu.design.pattern.structural.adapter.objectadapter;

/**
 * Author: zhihu
 * Description:
 * Date: Create in 2019/1/4 9:52
 */
public class Client {
    
    public static void main(String[] args) {
        Target adapterTarget = new Adapter();
        adapterTarget.request();
    }
}
