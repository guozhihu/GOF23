package com.zhihu.design.pattern.behavioral.strategy;

/**
 * Author: zhihu
 * Description: 满减促销策略
 * Date: Create in 2019/9/4 23:22
 */
public class ManJianPromotionStrategy implements PromotionStrategy {
    @Override
    public void doPromotion() {
        System.out.println("满减促销，满200-20元");
    }
}
