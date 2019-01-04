package com.zhihu.design.pattern.structural.adapter.classadapter;

/**
 * Author: zhihu
 * Description:
 * Date: Create in 2019/1/4 9:29
 */
public class Client {
    
    public static void main(String[] args) {
        Target adapterTarget = new Adapter();
        adapterTarget.request();
    }
}
