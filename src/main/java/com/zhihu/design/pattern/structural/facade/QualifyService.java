package com.zhihu.design.pattern.structural.facade;

/**
 * Author: zhihu
 * Description:库存服务子系统
 * Date: Create in 2018/12/27 6:28
 */
public class QualifyService {
    
    public boolean isAvailable(PointsGift pointsGift) {
        // 在实际场景中这里可能是一些比较复杂的判断逻辑
        System.out.println("校验" + pointsGift.getName() + "积分资格通过，库存通过");
        return true;
    }
}
