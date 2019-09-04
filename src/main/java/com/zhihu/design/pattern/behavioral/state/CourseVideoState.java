package com.zhihu.design.pattern.behavioral.state;

/**
 * Author: zhihu
 * Description:
 * Date: Create in 2019/9/2 23:59
 */
public abstract class CourseVideoState {
    
    protected CourseVideoContext courseVideoContext;
    
    public void setCourseVideoContext(CourseVideoContext courseVideoContext) {
        this.courseVideoContext = courseVideoContext;
    }
    
    public abstract void play();
    public abstract void speed();
    public abstract void pause();
    public abstract void stop();
}
