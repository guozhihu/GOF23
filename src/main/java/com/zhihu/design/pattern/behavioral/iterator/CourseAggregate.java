package com.zhihu.design.pattern.behavioral.iterator;

/**
 * Author: zhihu
 * Description:
 * Date: Create in 2019/9/6 0:21
 */
public interface CourseAggregate {
    
    void addCourse(Course course);
    
    void removeCourse(Course course);
    
    CourseIterator getCourseIterator();
}
