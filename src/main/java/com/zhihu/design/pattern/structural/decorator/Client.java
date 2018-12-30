package com.zhihu.design.pattern.structural.decorator;

/**
 * Author: zhihu
 * Description:
 * Date: Create in 2018/12/30 22:12
 */
public class Client {
    
    public static void main(String[] args) {
        ABattercake aBattercake;
        aBattercake = new Battercake();
        System.out.println(aBattercake.getDesc() + aBattercake.cost());
        
        aBattercake = new EggDecorator(aBattercake);
        System.out.println(aBattercake.getDesc() + aBattercake.cost());
    
        aBattercake = new EggDecorator(aBattercake);
        System.out.println(aBattercake.getDesc() + aBattercake.cost());
        
        aBattercake = new SausageDecorator(aBattercake);
        System.out.println(aBattercake.getDesc() + aBattercake.cost());
    }
}
