package com.zhihu.design.pattern.creational.abstractfactory;

/**
 * Author: zhihu
 * Description:
 * Date: Create in  2018/12/16 9:59
 */
public class PythonCourseFactory implements CourseFactory {
        @Override
        public Video getVideo() {
                return new PythonVideo();
        }

        @Override
        public Article getArticle() {
                return new PythonArticle();
        }
}
