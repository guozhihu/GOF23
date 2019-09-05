package com.zhihu.design.pattern.behavioral.observer;

/**
 * Author: zhihu
 * Description:
 * Date: Create in 2019/9/6 1:24
 */
public class Question {
    private String userName;
    private String questionContent;
    
    public String getUserName() {
        return userName;
    }
    
    public void setUserName(String userName) {
        this.userName = userName;
    }
    
    public String getQuestionContent() {
        return questionContent;
    }
    
    public void setQuestionContent(String questionContent) {
        this.questionContent = questionContent;
    }
}
