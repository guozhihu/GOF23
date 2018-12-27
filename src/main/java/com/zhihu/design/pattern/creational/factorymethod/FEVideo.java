package com.zhihu.design.pattern.creational.factorymethod;

/**
 * Author: zhihu
 * Description:
 * Date: Create in  2018/12/16 8:20
 */
public class FEVideo extends Video {
        @Override
        public void produce() {
                System.out.println("录制FE视频");
        }
}
