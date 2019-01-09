package com.zhihu.design.pattern.structural.composite;

import java.util.ArrayList;
import java.util.List;

/**
 * Author: zhihu
 * Description:
 * Date: Create in 2019/1/9 9:22
 */
public class CourseCatalog extends CatalogComponent {
    private List<CatalogComponent> items = new ArrayList<CatalogComponent>();
    // 目录名字
    private String name;
    // 目录级别
    private Integer level;
    
    public CourseCatalog(String name, Integer level) {
        this.name = name;
        this.level = level;
    }
    
    @Override
    public void add(CatalogComponent catalogComponent) {
        items.add(catalogComponent);
    }
    
    @Override
    public void remove(CatalogComponent catalogComponent) {
        items.remove(catalogComponent);
    }
    
    @Override
    public String getName(CatalogComponent catalogComponent) {
        return this.name;
    }
    
    @Override
    public void print() {
        System.out.println(this.name);
        for (CatalogComponent catalogComponent : items) {
            if (this.level != null) {
                for (int i = 0; i < this.level; i++) {
                    System.out.print("  ");
                }
            }
            catalogComponent.print();
        }
    }
}
