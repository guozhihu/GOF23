package com.zhihu.design.pattern.creational.builder;

/**
 * Author: zhihu
 * Description:
 * Date: Create in  2018/12/19 7:48
 */
public class Coach {
        private CourseBuilder courseBuilder;

        public void setCourseBuilder(CourseBuilder courseBuilder) {
                this.courseBuilder = courseBuilder;
        }

        public Course makeCourse(String courseName,String coursePPT,
                                 String courseVideo,String courseArticle,
                                 String courseQA){
                this.courseBuilder.buildCourseName(courseName);
                this.courseBuilder.buildCoursePPT(coursePPT);
                this.courseBuilder.buildCourseArticle(courseArticle);
                this.courseBuilder.buildCourseVideo(courseVideo);
                this.courseBuilder.buildCourseQA(courseQA);
                return this.courseBuilder.makeCourse();
        }
}
