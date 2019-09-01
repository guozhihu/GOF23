package com.zhihu.design.pattern.structural.bridge;

/**
 * Author: zhihu
 * Description:
 * Date: Create in 2019/9/1 8:00
 */
public class SavingAccount implements Account {
    @Override
    public Account openAccount() {
        System.out.println("打开活期账号");
        return new SavingAccount();
    }
    
    @Override
    public void showAccountType() {
        System.out.println("这是一个活期账号");
    }
}
