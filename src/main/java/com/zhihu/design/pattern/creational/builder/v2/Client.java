package com.zhihu.design.pattern.creational.builder.v2;

/**
 * Author: zhihu
 * Description:
 * Date: Create in  2018/12/19 8:40
 */
public class Client {

        public static void main(String[] args) {
                Course course = new Course.CourseBuilder().setCourseName("Java设计模式精讲").setCoursePPT("Java设计模式精讲PPT").setCourseVideo("Java设计模式精讲视频").build();
                System.out.println(course);
        }
}
