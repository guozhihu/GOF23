package com.zhihu.design.pattern.behavioral.command;

import lombok.AllArgsConstructor;

/**
 * Author: zhihu
 * Description:
 * Date: Create in 2019/9/7 12:36
 */
@AllArgsConstructor
public class CloseCourseVideoCommand implements Command {
    
    private CourseVideo courseVideo;
    
    @Override
    public void execute() {
        courseVideo.close();
    }
}
