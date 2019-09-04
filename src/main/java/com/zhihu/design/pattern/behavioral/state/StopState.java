package com.zhihu.design.pattern.behavioral.state;

/**
 * Author: zhihu
 * Description:
 * Date: Create in 2019/9/3 0:13
 */
public class StopState extends CourseVideoState {
    @Override
    public void play() {
        super.courseVideoContext.setCourseVideoState(CourseVideoContext.PLAY_STATE);
    }
    
    @Override
    public void speed() {
        System.out.println("ERROR 停止状态下不能快进！");
    }
    
    @Override
    public void pause() {
        System.out.println("ERROR 停止状态下不能暂停！");
    }
    
    @Override
    public void stop() {
        System.out.println("停止播放课程视频状态");
    }
}
