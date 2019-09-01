package com.zhihu.design.pattern.behavioral.chainofresponsibility;

/**
 * Author: zhihu
 * Description:
 * Date: Create in 2019/9/1 8:59
 */
public class Course {
    
    private String name;
    private String article;
    private String video;
    
    public String getName() {
        return name;
    }
    
    public void setName(String name) {
        this.name = name;
    }
    
    public String getArticle() {
        return article;
    }
    
    public void setArticle(String article) {
        this.article = article;
    }
    
    public String getVideo() {
        return video;
    }
    
    public void setVideo(String video) {
        this.video = video;
    }
    
    @Override
    public String toString() {
        return "Course{" +
            "name='" + name + '\'' +
            ", article='" + article + '\'' +
            ", video='" + video + '\'' +
            '}';
    }
}
