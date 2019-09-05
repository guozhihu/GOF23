package com.zhihu.design.pattern.behavioral.Interpreter;

/**
 * Author: zhihu
 * Description:
 * Date: Create in 2019/9/6 0:53
 */
public class MultiInterpreter implements Interpreter {
    private Interpreter firstExpression, secondExpression;
    
    public MultiInterpreter(Interpreter firstExpression, Interpreter secondExpression) {
        this.firstExpression = firstExpression;
        this.secondExpression = secondExpression;
    }
    
    @Override
    public int interpret() {
        return this.firstExpression.interpret() * this.secondExpression.interpret();
    }
    
    @Override
    public String toString() {
        return "*";
    }
}
