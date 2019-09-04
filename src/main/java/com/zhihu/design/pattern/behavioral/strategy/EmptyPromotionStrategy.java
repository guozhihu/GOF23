package com.zhihu.design.pattern.behavioral.strategy;

/**
 * Author: zhihu
 * Description:
 * Date: Create in 2019/9/4 23:55
 */
public class EmptyPromotionStrategy implements PromotionStrategy {
    @Override
    public void doPromotion() {
        System.out.println("无促销");
    }
}
