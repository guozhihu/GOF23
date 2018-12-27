package com.zhihu.design.pattern.creational.abstractfactory;

/**
 * Author: zhihu
 * Description:
 * Date: Create in  2018/12/16 9:58
 */
public class PythonArticle extends Article {
        @Override
        public void produce() {
                System.out.println("编写Python课程手记");
        }
}
