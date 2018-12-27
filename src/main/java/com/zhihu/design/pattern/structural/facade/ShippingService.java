package com.zhihu.design.pattern.structural.facade;

/**
 * Author: zhihu
 * Description:物流服务子系统
 * Date: Create in 2018/12/27 6:33
 */
public class ShippingService {
    
    public String shipGift(PointsGift pointsGift) {
        // 物流系统的对接逻辑
        System.out.println(pointsGift.getName() + "进入物流系统");
        String shippingOrderNo = "666";
        return shippingOrderNo;
    }
}
