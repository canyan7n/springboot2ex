package com.canyan7n.springbootex.myconfiguration;

import com.canyan7n.springbootex.pojo.Car;
import com.canyan7n.springbootex.pojo.Person;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.context.annotation.ImportResource;

/**
 * @author ：macheng
 * @version V1.0
 * @ClassName :MyConfiguration
 * @date ：2023/5/3 20:23
 * @description：TODO
 */
@Configuration(proxyBeanMethods = false)
// @Import({Car.class, Person.class})
@ImportResource("classpath:ioc.xml")
public class BeanConfiguration {

    @Bean
    public Person person01(){
        return new Person();
    }
}
