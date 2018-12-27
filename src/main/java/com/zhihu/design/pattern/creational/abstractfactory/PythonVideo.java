package com.zhihu.design.pattern.creational.abstractfactory;

/**
 * Author: zhihu
 * Description:
 * Date: Create in  2018/12/16 9:58
 */
public class PythonVideo extends Video {
        @Override
        public void produce() {
                System.out.println("录制Python课程视频");
        }
}
