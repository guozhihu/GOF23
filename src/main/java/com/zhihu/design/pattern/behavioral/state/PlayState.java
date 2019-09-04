package com.zhihu.design.pattern.behavioral.state;

/**
 * Author: zhihu
 * Description:
 * Date: Create in 2019/9/3 0:12
 */
public class PlayState extends CourseVideoState {
    @Override
    public void play() {
        System.out.println("正常播放课程视频状态");
    }
    
    @Override
    public void speed() {
        super.courseVideoContext.setCourseVideoState(CourseVideoContext.SPEED_STATE);
    }
    
    @Override
    public void pause() {
        super.courseVideoContext.setCourseVideoState(CourseVideoContext.PAUSE_STATE);
    }
    
    @Override
    public void stop() {
        super.courseVideoContext.setCourseVideoState(CourseVideoContext.STOP_STATE);
    }
}
