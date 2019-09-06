package com.zhihu.design.pattern.behavioral.memento;

import java.util.Stack;

/**
 * Author: zhihu
 * Description:
 * Date: Create in 2019/9/6 23:10
 */
public class ArticleMementoManager {
    
    private final Stack<ArticleMemento> ARTICLE_MEMENTO_STACK = new Stack<ArticleMemento>();
    
    public ArticleMemento getMemento() {
        ArticleMemento articleMemento = ARTICLE_MEMENTO_STACK.pop();
        return articleMemento;
    }
    
    public void addMemento(ArticleMemento articleMemento) {
        ARTICLE_MEMENTO_STACK.push(articleMemento);
    }
}
