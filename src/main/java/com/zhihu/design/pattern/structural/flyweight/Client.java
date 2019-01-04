package com.zhihu.design.pattern.structural.flyweight;

/**
 * Author: zhihu
 * Description:
 * Date: Create in 2019/1/4 11:57
 */
public class Client {
    
    private static final String departments[] = {"RD", "QA", "PM", "BD"};
    
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            String department  = departments[(int)(Math.random() * departments.length)];
            Manager manager = (Manager) EmployeeFactory.getManager(department);
            manager.report();
        }
    }
}
