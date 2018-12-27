package com.zhihu.design.pattern.creational.abstractfactory;

/**
 * Author: zhihu
 * Description:
 * Date: Create in  2018/12/16 9:55
 */
public class JavaCourseFactory implements CourseFactory {
        @Override
        public Video getVideo() {
                return new JavaVideo();
        }

        @Override
        public Article getArticle() {
                return new JavaArticle();
        }
}
