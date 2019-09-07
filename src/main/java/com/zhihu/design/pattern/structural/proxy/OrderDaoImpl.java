package com.zhihu.design.pattern.structural.proxy;

/**
 * Author: zhihu
 * Description:
 * Date: Create in 2019/9/7 13:42
 */
public class OrderDaoImpl implements IOrderDao {
    @Override
    public int insert(Order order) {
        System.out.println("Dao层添加Order成功");
        return 1;
    }
}
