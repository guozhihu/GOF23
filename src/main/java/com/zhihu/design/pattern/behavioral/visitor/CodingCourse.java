package com.zhihu.design.pattern.behavioral.visitor;

/**
 * Author: zhihu
 * Description:
 * Date: Create in 2019/9/1 23:29
 */
public class CodingCourse extends Course {
    
    private int price;
    
    public int getPrice() {
        return price;
    }
    
    public void setPrice(int price) {
        this.price = price;
    }
    
    @Override
    public void accept(IVisitor visitor) {
        visitor.visit(this);
    }
}
