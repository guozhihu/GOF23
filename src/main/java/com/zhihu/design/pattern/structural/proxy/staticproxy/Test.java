package com.zhihu.design.pattern.structural.proxy.staticproxy;

import com.zhihu.design.pattern.structural.proxy.Order;

/**
 * Author: zhihu
 * Description:
 * Date: Create in 2019/9/7 13:51
 */
public class Test {
    public static void main(String[] args) {
        Order order = new Order();
        order.setUserId(1);
        
        OrderServiceStaticProxy orderServiceStaticProxy = new OrderServiceStaticProxy();
        orderServiceStaticProxy.saveOrder(order);
    }
}
