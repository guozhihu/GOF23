package com.zhihu.design.pattern.behavioral.memento;

import lombok.AllArgsConstructor;
import lombok.Data;

/**
 * Author: zhihu
 * Description:
 * Date: Create in 2019/9/6 23:07
 */
@Data
@AllArgsConstructor
public class Article {
    
    private String title;
    private String content;
    private String imgs;
    
    public ArticleMemento saveToMemento() {
        ArticleMemento articleMemento = new ArticleMemento(this.title, this.content, this.imgs);
        return articleMemento;
    }
    
    public void undoFromMemento(ArticleMemento articleMemento) {
        this.title = articleMemento.getTitle();
        this.content = articleMemento.getContent();
        this.imgs = articleMemento.getImgs();
    }
    
    @Override
    public String toString() {
        return "Article{" +
            "title='" + title + '\'' +
            ", content='" + content + '\'' +
            ", imgs='" + imgs + '\'' +
            '}';
    }
}
