package com.zhihu.design.pattern.structural.bridge;

/**
 * Author: zhihu
 * Description:
 * Date: Create in 2019/9/1 8:02
 */
public class ABCBank extends Bank {
    public ABCBank(Account account) {
        super(account);
    }
    
    @Override
    Account openAccount() {
        System.out.println("打开中国农业银行账号");
        account.openAccount();
        return account;
    }
}
