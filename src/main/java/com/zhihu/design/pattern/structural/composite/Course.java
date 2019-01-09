package com.zhihu.design.pattern.structural.composite;

/**
 * Author: zhihu
 * Description:
 * Date: Create in 2019/1/9 9:18
 */
public class Course extends CatalogComponent {
    // 课程名称
    private String name;
    // 课程价格
    private double price;
    
    public Course(String name, double price) {
        this.name = name;
        this.price = price;
    }
    
    @Override
    public String getName(CatalogComponent catalogComponent) {
        return this.name;
    }
    
    @Override
    public double getPrice(CatalogComponent catalogComponent) {
        return this.price;
    }
    
    @Override
    public void print() {
        System.out.println("Course Name: " + name + " Price: " + price);
    }
}
