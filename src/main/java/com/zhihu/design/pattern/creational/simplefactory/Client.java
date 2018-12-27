package com.zhihu.design.pattern.creational.simplefactory;

/**
 * Author: zhihu
 * Description:
 * Date: Create in  2018/12/16 6:23
 */
public class Client {

        public static void main(String[] args) {
                VideoFactory factory = new VideoFactory();
                Video video = factory.getVideo(JavaVideo.class);
                if (null == video) {
                        return ;
                }
                video.produce();

        }
}
