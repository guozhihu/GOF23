package com.zhihu.design.pattern.creational.abstractfactory;

/**
 * Author: zhihu
 * Description:
 * Date: Create in  2018/12/16 9:52
 */
public class JavaArticle extends Article {
        @Override
        public void produce() {
                System.out.println("编写Java课程手记");
        }
}
