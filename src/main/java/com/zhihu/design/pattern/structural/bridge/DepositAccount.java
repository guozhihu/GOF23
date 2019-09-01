package com.zhihu.design.pattern.structural.bridge;

/**
 * Author: zhihu
 * Description:
 * Date: Create in 2019/9/1 7:59
 */
public class DepositAccount implements Account {
    @Override
    public Account openAccount() {
        System.out.println("打开定期账号");
        return new DepositAccount();
    }
    
    @Override
    public void showAccountType() {
        System.out.println("这是一个定期账号");
    }
}
