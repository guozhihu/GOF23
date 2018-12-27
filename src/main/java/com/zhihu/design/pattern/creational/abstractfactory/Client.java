package com.zhihu.design.pattern.creational.abstractfactory;

/**
 * Author: zhihu
 * Description:
 * Date: Create in  2018/12/16 10:00
 */
public class Client {
        public static void main(String[] args) {
                CourseFactory javaCourseFactory = new JavaCourseFactory();
                Video javaVideo = javaCourseFactory.getVideo();
                javaVideo.produce();
                Article javaArticle = javaCourseFactory.getArticle();
                javaArticle.produce();

                CourseFactory pythonCourseFactory = new PythonCourseFactory();
                Video pythonVideo = pythonCourseFactory.getVideo();
                pythonVideo.produce();
                Article pythonArticle = pythonCourseFactory.getArticle();
                pythonArticle.produce();
        }
}
