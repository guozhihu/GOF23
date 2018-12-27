package com.zhihu.design.pattern.structural.facade;

/**
 * Author: zhihu
 * Description:
 * Date: Create in 2018/12/27 7:06
 */
public class Client {
    public static void main(String[] args) {
        PointsGift pointsGift = new PointsGift("T恤");
        GiftExchangeService giftExchangeService = new GiftExchangeService();
        giftExchangeService.giftExchange(pointsGift);
    }
}
