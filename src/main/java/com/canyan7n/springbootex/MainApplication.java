package com.canyan7n.springbootex;

import com.canyan7n.springbootex.pojo.Car;
import com.canyan7n.springbootex.pojo.Person;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

/**
 * @author ：macheng
 * @version V1.0
 * @ClassName :MainApplication
 * @date ：2023/5/3 20:11
 * @description：TODO
 */
@SpringBootApplication
public class MainApplication {
    public static void main(String[] args) {
        ConfigurableApplicationContext run = SpringApplication.run(MainApplication.class, args);
/*        String[] beanDefinitionNames = run.getBeanDefinitionNames();
        for(String name : beanDefinitionNames){
            System.out.println(name);
        }

        Person bean1 = run.getBean(Person.class);
        Person bean2 = run.getBean(Person.class);
        System.out.println("bean1=bean2:" + (bean1==bean2));
        bean1.name();

        Car car01 = run.getBean("car01", Car.class);
        System.out.println(car01);*/

    }
}
