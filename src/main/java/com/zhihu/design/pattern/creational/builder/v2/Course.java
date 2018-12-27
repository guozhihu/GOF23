package com.zhihu.design.pattern.creational.builder.v2;

/**
 * Author: zhihu
 * Description:
 * Date: Create in  2018/12/19 8:17
 */
public class Course {

        private String courseName;
        private String coursePPT;
        private String courseVideo;
        private String courseArticle;

        // question & answer
        private String courseQA;

        public Course(CourseBuilder courseBuilder){
                this.courseName = courseBuilder.courseName;
                this.coursePPT = courseBuilder.coursePPT;
                this.courseVideo = courseBuilder.courseVideo;
                this.courseArticle = courseBuilder.courseArticle;
                this.courseQA = courseBuilder.courseQA;
        }

        @Override
        public String toString() {
                return "Course{" +
                        "courseName='" + courseName + '\'' +
                        ", coursePPT='" + coursePPT + '\'' +
                        ", courseVideo='" + courseVideo + '\'' +
                        ", courseArticle='" + courseArticle + '\'' +
                        ", courseQA='" + courseQA + '\'' +
                        '}';
        }

        public static class CourseBuilder{
                private String courseName;
                private String coursePPT;
                private String courseVideo;
                private String courseArticle;

                // question & answer
                private String courseQA;

                public CourseBuilder setCourseName(String courseName) {
                        this.courseName = courseName;
                        return this;
                }

                public CourseBuilder setCourseVideo(String courseVideo){
                        this.courseVideo = courseVideo;
                        return this;
                }

                public CourseBuilder setCoursePPT(String coursePPT) {
                        this.coursePPT = coursePPT;
                        return this;
                }

                public CourseBuilder setCourseArticle(String courseArticle) {
                        this.courseArticle = courseArticle;
                        return this;
                }

                public CourseBuilder setCourseQA(String courseQA) {
                        this.courseQA = courseQA;
                        return this;
                }

                public Course build(){
                        return new Course(this);
                }
        }
}
