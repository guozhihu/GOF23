package com.zhihu.design.pattern.creational.factorymethod;

/**
 * Author: zhihu
 * Description:
 * Date: Create in  2018/12/16 6:23
 */
public class Client {

        public static void main(String[] args) {
                VideoFactory javaVideoFactory = new JavaVideoFactory();
                Video javaVideo = javaVideoFactory.getVideo();
                javaVideo.produce();

                VideoFactory pythonVideoFactory = new PythonVideoFactory();
                Video pythonVideo = pythonVideoFactory.getVideo();
                pythonVideo.produce();

                VideoFactory fEVideoFactory = new FEVideoFactory();
                Video fEVideo = fEVideoFactory.getVideo();
                fEVideo.produce();
        }
}
