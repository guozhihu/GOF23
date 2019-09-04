package com.zhihu.design.pattern.behavioral.strategy;

import org.apache.commons.lang3.StringUtils;

/**
 * Author: zhihu
 * Description:
 * Date: Create in 2019/9/4 23:44
 */
public class Test {
    
    public static void main(String[] args) {
//        // 这样的代码含有大量的if...else if...else,太丑了
//        PromotionActivity promotionActivity = null;
//
//        String promotionKey = "LIJIAN";
//
//        if (StringUtils.equals(promotionKey, "LIJIAN")) {
//            promotionActivity = new PromotionActivity(new LijianPromotionStrategy());
//        } else if (StringUtils.equals(promotionKey, "FANXIAN")) {
//            promotionActivity = new PromotionActivity(new FanXianPromotionStrategy());
//        } //......
//
//        promotionActivity.executePromotionStrategy();
        
        // 结合工厂模式，去除大量的if...else if...else代码块，让代码看起来更优雅
        String promotionKey = "LIJIAN";
        PromotionActivity promotionActivity = new PromotionActivity(PromotionStrategyFactory.getPromotionStrategy(promotionKey));
        promotionActivity.executePromotionStrategy();
    }
}
