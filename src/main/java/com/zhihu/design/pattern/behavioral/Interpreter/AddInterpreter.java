package com.zhihu.design.pattern.behavioral.Interpreter;

/**
 * Author: zhihu
 * Description: 加法解释器
 * Date: Create in 2019/9/6 0:50
 */
public class AddInterpreter implements Interpreter {
    
    private Interpreter firstExpression, secondExpression;
    
    public AddInterpreter(Interpreter firstExpression, Interpreter secondExpression) {
        this.firstExpression = firstExpression;
        this.secondExpression = secondExpression;
    }
    
    @Override
    public int interpret() {
        return this.firstExpression.interpret() + this.secondExpression.interpret();
    }
    
    @Override
    public String toString() {
        return "+";
    }
}
