package com.zhihu.design.pattern.structural.facade;

import lombok.Data;

/**
 * Author: zhihu
 * Description:
 * Date: Create in 2018/12/27 6:27
 */
@Data
public class PointsGift {
    private String name;
    
    public PointsGift(String name) {
        this.name = name;
    }
}
