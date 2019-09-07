package com.zhihu.design.pattern.structural.proxy.dynamicproxy;

import com.zhihu.design.pattern.structural.proxy.IOrderService;
import com.zhihu.design.pattern.structural.proxy.Order;
import com.zhihu.design.pattern.structural.proxy.OrderServiceImpl;

/**
 * Author: zhihu
 * Description:
 * Date: Create in 2019/9/7 14:19
 */
public class Test {
    public static void main(String[] args) {
        Order order = new Order();
        order.setUserId(1);
        IOrderService orderServiceDynamicProxy = (IOrderService) new OrderServiceDynamicProxy(new OrderServiceImpl()).bind();
        
        orderServiceDynamicProxy.saveOrder(order);
    }
}
