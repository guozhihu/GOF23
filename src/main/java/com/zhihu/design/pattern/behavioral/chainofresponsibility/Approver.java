package com.zhihu.design.pattern.behavioral.chainofresponsibility;

/**
 * Author: zhihu
 * Description:
 * Date: Create in 2019/9/1 8:58
 */
public abstract class Approver {
    protected Approver approver;
    
    public void setNextApprover(Approver approver) {
        this.approver = approver;
    }
    
    public abstract void deploy(Course course);
}
