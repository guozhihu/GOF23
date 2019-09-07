package com.zhihu.design.pattern.structural.proxy;

/**
 * Author: zhihu
 * Description:
 * Date: Create in 2019/9/7 13:44
 */
public class OrderServiceImpl implements IOrderService {
    
    private IOrderDao iOrderDao;
    
    @Override
    public int saveOrder(Order order) {
        // Spring会自己注入，这里我们直接用new
        iOrderDao = new OrderDaoImpl();
        System.out.println("Service层调用Dao层添加Order");
        return iOrderDao.insert(order);
    }
}
