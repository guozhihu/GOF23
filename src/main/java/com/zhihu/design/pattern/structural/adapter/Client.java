package com.zhihu.design.pattern.structural.adapter;

/**
 * Author: zhihu
 * Description:
 * Date: Create in 2019/1/4 10:13
 */
public class Client {
    
    public static void main(String[] args) {
        DC5 dc5 = new PowerAdapter();
        dc5.outputDC5V();
    }
}
