package com.zhihu.design.pattern.structural.decorator;

/**
 * Author: zhihu
 * Description:
 * Date: Create in 2018/12/30 16:48
 */
public class Battercake extends ABattercake {
    @Override
    protected String getDesc() {
        return "煎饼";
    }
    
    @Override
    protected int cost() {
        return 8;
    }
}
