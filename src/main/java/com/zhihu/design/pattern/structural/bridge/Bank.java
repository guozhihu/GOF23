package com.zhihu.design.pattern.structural.bridge;

/**
 * Author: zhihu
 * Description:
 * Date: Create in 2019/9/1 7:57
 */
public abstract class Bank {
    protected Account account;
    
    public Bank(Account account) {
        this.account = account;
    }
    
    abstract Account openAccount();
}
