package com.zhihu.design.pattern.creational.singleton;

import org.apache.commons.lang3.StringUtils;

import java.util.HashMap;
import java.util.Map;

/**
 * Author: zhihu
 * Description:容器单例
 * Date: Create in 2018/12/22 8:09
 */
public class ContainerSingleton {
    
    private ContainerSingleton(){}
    
    private static Map<String, Object> singleton = new HashMap<String, Object>();
    
    public static void putInstance(String key, Object instance) {
        if (StringUtils.isNotBlank(key) && null != instance){
            if (!singleton.containsKey(key)) {
                singleton.put(key, instance);
            }
        }
    }
    
    public static Object getInstance(String key) {
        return singleton.get(key);
    }
}
