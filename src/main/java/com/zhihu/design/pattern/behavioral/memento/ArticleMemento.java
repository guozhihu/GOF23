package com.zhihu.design.pattern.behavioral.memento;

import lombok.AllArgsConstructor;
import lombok.Getter;

/**
 * Author: zhihu
 * Description:
 * Date: Create in 2019/9/6 23:09
 */
@AllArgsConstructor
@Getter
public class ArticleMemento {
    private String title;
    private String content;
    private String imgs;
}
