package com.zhihu.design.pattern.behavioral.mediator;

import java.util.Date;

/**
 * Author: zhihu
 * Description:
 * Date: Create in 2019/9/7 12:57
 */
public class StudyGroup {
    
    public static void showMessage(User user, String message) {
        System.out.println(new Date().toString() + " [" + user.getName() + "] : " + message);
    }
}
