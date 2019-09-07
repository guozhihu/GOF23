package com.zhihu.design.pattern.behavioral.mediator;

import lombok.AllArgsConstructor;
import lombok.Data;

/**
 * Author: zhihu
 * Description:
 * Date: Create in 2019/9/7 12:57
 */
@Data
@AllArgsConstructor
public class User {
    private String name;
    
    public void sendMessage(String message) {
        StudyGroup.showMessage(this, message);
    }
}
