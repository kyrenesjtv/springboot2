package com.github.kyrenesjtv.springboot2.springboot2_withmail.utils;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

/**
 * @ProjectName: springboot2
 * @Author: wanglin
 * @CreateDate: 2018/7/12 17:16
 */
public class PropertyUtil {
    private static final Logger LOGGER = LoggerFactory.getLogger(PropertyUtil.class);

    //加载property文件到io流里面
    public static Properties loadProperties(String propertyFile) {
        Properties properties = new Properties();
        try {
            InputStream is = PropertyUtil.class.getClassLoader().getResourceAsStream(propertyFile);
            if(is == null){
                is = PropertyUtil.class.getClassLoader().getResourceAsStream(propertyFile);
            }
            properties.load(is);
        } catch (IOException e) {
            LOGGER.info(e.getMessage());
            e.printStackTrace();
        }
        return properties;
    }
}
