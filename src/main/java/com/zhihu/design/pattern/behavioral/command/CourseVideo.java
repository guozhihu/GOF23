package com.zhihu.design.pattern.behavioral.command;

import lombok.AllArgsConstructor;

/**
 * Author: zhihu
 * Description:
 * Date: Create in 2019/9/7 12:33
 */
@AllArgsConstructor
public class CourseVideo {
    private String name;
    
    public void open() {
        System.out.println(this.name + "课程视频开放");
    }
    
    public void close() {
        System.out.println(this.name + "课程视频关闭");
    }
}
