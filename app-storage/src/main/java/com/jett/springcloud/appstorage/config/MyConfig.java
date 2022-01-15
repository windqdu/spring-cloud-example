package com.jett.springcloud.appstorage.config;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.core.config.GlobalConfig;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

/**
 * @author wind
 * @date 2022/01/16 1:47
 */
@Component
public class MyConfig {
    @Bean
    public GlobalConfig globalConfig() {
        GlobalConfig conf = new GlobalConfig();
        conf.setDbConfig(new GlobalConfig.DbConfig().setIdType(IdType.AUTO));
        return conf;
    }
}
