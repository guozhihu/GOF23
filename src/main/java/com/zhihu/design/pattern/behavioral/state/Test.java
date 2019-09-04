package com.zhihu.design.pattern.behavioral.state;

/**
 * Author: zhihu
 * Description:
 * Date: Create in 2019/9/3 0:30
 */
public class Test {
    public static void main(String[] args) {
        CourseVideoContext courseVideoContext = new CourseVideoContext();
        courseVideoContext.setCourseVideoState(new PlayState());
    
        System.out.println("当前状态：" + courseVideoContext.getCourseVideoState().getClass().getSimpleName());
        courseVideoContext.pause();
        
        System.out.println("当前状态：" + courseVideoContext.getCourseVideoState().getClass().getSimpleName());
        courseVideoContext.speed();
    
        System.out.println("当前状态：" + courseVideoContext.getCourseVideoState().getClass().getSimpleName());
        courseVideoContext.stop();
    
        System.out.println("当前状态：" + courseVideoContext.getCourseVideoState().getClass().getSimpleName());
        
        courseVideoContext.speed();
    }
}
