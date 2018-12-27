package com.zhihu.design.pattern.creational.factorymethod;

/**
 * Author: zhihu
 * Description:
 * Date: Create in  2018/12/16 8:21
 */
public class FEVideoFactory extends VideoFactory {
        @Override
        public Video getVideo() {
                return new FEVideo();
        }
}
