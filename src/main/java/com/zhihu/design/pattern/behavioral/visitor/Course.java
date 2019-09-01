package com.zhihu.design.pattern.behavioral.visitor;

/**
 * Author: zhihu
 * Description:
 * Date: Create in 2019/9/1 23:27
 */
public abstract class Course {
    private String name;
    
    public String getName() {
        return name;
    }
    
    public void setName(String name) {
        this.name = name;
    }
    
    public abstract void accept(IVisitor visitor);
}
