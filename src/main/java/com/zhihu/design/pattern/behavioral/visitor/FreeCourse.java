package com.zhihu.design.pattern.behavioral.visitor;

/**
 * Author: zhihu
 * Description:
 * Date: Create in 2019/9/1 23:30
 */
public class FreeCourse extends Course {
    
    @Override
    public void accept(IVisitor visitor) {
        visitor.visit(this);
    }
}
