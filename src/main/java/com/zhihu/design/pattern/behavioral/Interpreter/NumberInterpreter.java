package com.zhihu.design.pattern.behavioral.Interpreter;

/**
 * Author: zhihu
 * Description: 数字解释器
 * Date: Create in 2019/9/6 0:54
 */
public class NumberInterpreter implements Interpreter {
    
    private int number;
    
    public NumberInterpreter(int number) {
        this.number = number;
    }
    
    public NumberInterpreter(String number) {
        this.number = Integer.parseInt(number);
    }
    
    @Override
    public int interpret() {
        return this.number;
    }
}
