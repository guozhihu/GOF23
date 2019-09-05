package com.zhihu.design.pattern.behavioral.observer;

import java.util.Observable;

/**
 * Author: zhihu
 * Description: 被观察者
 * Date: Create in 2019/9/6 1:24
 */
public class Course extends Observable {
    private String courseName;
    
    public Course(String courseName) {
        this.courseName = courseName;
    }
    
    public String getCourseName() {
        return courseName;
    }
    
    public void produceQuestion(Course course, Question question) {
        System.out.println(question.getUserName() + "在" + course.courseName + "提交了一个问题");
        setChanged();
        notifyObservers(question);
    }
}
