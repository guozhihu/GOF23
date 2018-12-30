package com.zhihu.design.pattern.structural.decorator;

/**
 * Author: zhihu
 * Description:
 * Date: Create in 2018/12/30 22:11
 */
public class EggDecorator extends AbstractDecorator {
    
    
    public EggDecorator(ABattercake aBattercake) {
        super(aBattercake);
    }
    
    @Override
    protected void doSomething() {
    
    }
    
    @Override
    protected String getDesc() {
        return super.getDesc() + " 加一个鸡蛋";
    }
    
    @Override
    protected int cost() {
        return super.cost() + 1;
    }
}
