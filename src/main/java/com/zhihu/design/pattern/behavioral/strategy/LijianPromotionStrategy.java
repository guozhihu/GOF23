package com.zhihu.design.pattern.behavioral.strategy;

/**
 * Author: zhihu
 * Description: 立减促销策略
 * Date: Create in 2019/9/4 23:23
 */
public class LijianPromotionStrategy implements PromotionStrategy {
    @Override
    public void doPromotion() {
        System.out.println("立减促销，课程的价格直接减去配置的价格");
    }
}
