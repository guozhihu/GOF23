package com.zhihu.design.pattern.creational.simplefactory;

/**
 * Author: zhihu
 * Description:
 * Date: Create in  2018/12/16 6:17
 */
public class PythonVideo extends Video {
        @Override
        public void produce() {
                System.out.println("录制Python视频");
        }
}
