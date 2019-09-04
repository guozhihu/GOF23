package com.zhihu.design.pattern.behavioral.strategy;

/**
 * Author: zhihu
 * Description: 返现促销策略
 * Date: Create in 2019/9/4 23:25
 */
public class FanXianPromotionStrategy implements PromotionStrategy {
    @Override
    public void doPromotion() {
        System.out.println("返现促销，返回的金额存放到慕课网用户的余额中");
    }
}
