package com.zhihu.design.pattern.creational.abstractfactory;

/**
 * Author: zhihu
 * Description:
 * Date: Create in  2018/12/16 9:51
 */
public class JavaVideo extends Video {
        @Override
        public void produce() {
                System.out.println("录制Java课程视频");
        }
}
