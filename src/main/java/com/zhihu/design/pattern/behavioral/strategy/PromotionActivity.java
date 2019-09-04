package com.zhihu.design.pattern.behavioral.strategy;

/**
 * Author: zhihu
 * Description:
 * Date: Create in 2019/9/4 23:33
 */
public class PromotionActivity {
    private PromotionStrategy promotionStrategy;
    
    public PromotionActivity(PromotionStrategy promotionStrategy) {
        this.promotionStrategy = promotionStrategy;
    }
    
    public void executePromotionStrategy(){
        this.promotionStrategy.doPromotion();
    }
}
