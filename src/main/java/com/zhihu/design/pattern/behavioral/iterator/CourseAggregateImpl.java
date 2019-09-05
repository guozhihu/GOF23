package com.zhihu.design.pattern.behavioral.iterator;

import java.util.ArrayList;
import java.util.List;

/**
 * Author: zhihu
 * Description:
 * Date: Create in 2019/9/6 0:23
 */
public class CourseAggregateImpl implements CourseAggregate {
    
    private List courseList;
    
    public CourseAggregateImpl() {
        this.courseList = new ArrayList();
    }
    
    @Override
    public void addCourse(Course course) {
        this.courseList.add(course);
    }
    
    @Override
    public void removeCourse(Course course) {
        this.courseList.remove(course);
    }
    
    @Override
    public CourseIterator getCourseIterator() {
        return new CourseIteratorImpl(courseList);
    }
}
