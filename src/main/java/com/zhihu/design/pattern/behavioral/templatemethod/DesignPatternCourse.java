package com.zhihu.design.pattern.behavioral.templatemethod;

/**
 * Author: zhihu
 * Description:
 * Date: Create in 2019/9/5 23:56
 */
public class DesignPatternCourse extends ACourse {
    @Override
    void packageCourse() {
        System.out.println("提供课程Java源代码");
    }
    
    @Override
    protected boolean needWriteArticle() {
        return true;
    }
}
