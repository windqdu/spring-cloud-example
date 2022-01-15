package com.jett.springcloud.apporder.config;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.core.config.GlobalConfig;
import com.baomidou.mybatisplus.extension.incrementer.H2KeyGenerator;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

/**
 * @author wind
 * @date 2022/01/16 1:47
 */
//@Configuration
public class MyConfig {
//    @Bean
    public GlobalConfig globalConfig() {
        GlobalConfig conf = new GlobalConfig();
        conf.setDbConfig(new GlobalConfig.DbConfig().setIdType(IdType.AUTO).setKeyGenerator(new H2KeyGenerator()));
        return conf;
    }
}
