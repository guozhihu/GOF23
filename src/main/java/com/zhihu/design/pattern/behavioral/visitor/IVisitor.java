package com.zhihu.design.pattern.behavioral.visitor;

/**
 * Author: zhihu
 * Description:
 * Date: Create in 2019/9/1 23:25
 */
public interface IVisitor {
    
    void visit(FreeCourse freeCourse);
    
    void visit(CodingCourse codingCourse);
}
