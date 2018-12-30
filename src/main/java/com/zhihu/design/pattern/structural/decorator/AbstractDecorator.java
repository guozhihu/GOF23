package com.zhihu.design.pattern.structural.decorator;

/**
 * Author: zhihu
 * Description:
 * Date: Create in 2018/12/30 16:52
 */
public abstract class AbstractDecorator extends ABattercake {
    
    private ABattercake aBattercake;
    
    protected abstract void doSomething();
    
    public AbstractDecorator(ABattercake aBattercake){
        this.aBattercake = aBattercake;
    }
    
    @Override
    protected String getDesc() {
        return this.aBattercake.getDesc();
    }
    
    @Override
    protected int cost() {
        return this.aBattercake.cost();
    }
}
