package com.zhihu.design.pattern.structural.decorator;

/**
 * Author: zhihu
 * Description:
 * Date: Create in 2018/12/30 23:15
 */
public class SausageDecorator extends AbstractDecorator {
    
    public SausageDecorator(ABattercake aBattercake) {
        super(aBattercake);
    }
    
    @Override
    protected void doSomething() {
    
    }
    
    @Override
    protected String getDesc() {
        return super.getDesc() + " 加一根香肠";
    }
    
    @Override
    protected int cost() {
        return super.cost() + 2;
    }
}
