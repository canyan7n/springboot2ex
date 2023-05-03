package com.canyan7n.springbootex.myconfiguration;

import org.springframework.boot.autoconfigure.condition.ConditionalOnBean;
import org.springframework.boot.autoconfigure.condition.ConditionalOnClass;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingClass;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Conditional;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.multipart.MultipartResolver;





/**
 * @author ：macheng
 * @version V1.0
 * @ClassName :MulResConfiguration
 * @date ：2023/5/3 21:27
 * @description：TODO
 */
@Configuration
public class MulResConfiguration{

    @Bean
    @ConditionalOnBean(MultipartResolver.class)
    public MultipartResolver multipartResolver01(MultipartResolver multipartResolver){
        return multipartResolver;
    }
}
