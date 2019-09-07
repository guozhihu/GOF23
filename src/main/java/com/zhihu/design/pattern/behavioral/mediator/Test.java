package com.zhihu.design.pattern.behavioral.mediator;

/**
 * Author: zhihu
 * Description:
 * Date: Create in 2019/9/7 12:57
 */
public class Test {
    
    public static void main(String[] args) {
        User zhihu = new User("Zhihu");
        User tom = new User("Tom");
        
        zhihu.sendMessage(" Hey! Tom! Let's learn Design Pattern");
        tom.sendMessage("OK! Zhihu");
    }
}
