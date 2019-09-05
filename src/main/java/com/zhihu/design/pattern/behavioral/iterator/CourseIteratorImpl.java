package com.zhihu.design.pattern.behavioral.iterator;

import java.util.List;

/**
 * Author: zhihu
 * Description:
 * Date: Create in 2019/9/6 0:26
 */
public class CourseIteratorImpl implements CourseIterator {
    
    private List courseList;
    private int position;
    private Course course;
    
    public CourseIteratorImpl(List courseList) {
        this.courseList = courseList;
    }
    
    @Override
    public Course nextCourse() {
        System.out.println("返回课程，位置是：" + position);
        course = (Course) courseList.get(position);
        position++;
        return course;
    }
    
    @Override
    public boolean isLastCourse() {
        return !(position < courseList.size());
    }
}
