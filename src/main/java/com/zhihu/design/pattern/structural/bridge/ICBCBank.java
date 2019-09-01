package com.zhihu.design.pattern.structural.bridge;

/**
 * Author: zhihu
 * Description:
 * Date: Create in 2019/9/1 8:04
 */
public class ICBCBank extends Bank {
    public ICBCBank(Account account) {
        super(account);
    }
    
    @Override
    Account openAccount() {
        System.out.println("打开中国工商银行账号");
        account.openAccount();
        return account;
    }
}
