package com.zhihu.design.pattern.structural.facade;

/**
 * Author: zhihu
 * Description:支付子系统
 * Date: Create in 2018/12/27 6:31
 */
public class PointsPaymentService {
    
    public boolean pay(PointsGift pointsGift) {
        // 扣减积分,在实际场景中这里可能是一些比较复杂的判断逻辑
        System.out.println("支付" + pointsGift.getName() + "积分成功");
        return true;
    }
}
