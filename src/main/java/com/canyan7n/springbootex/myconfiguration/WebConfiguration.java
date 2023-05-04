package com.canyan7n.springbootex.myconfiguration;

import com.canyan7n.springbootex.pojo.Car;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.convert.converter.Converter;
import org.springframework.format.FormatterRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/**
 * @author ：macheng
 * @version V1.0
 * @ClassName :WebConfiguration
 * @date ：2023/5/4 18:08
 * @description：TODO
 */
@Configuration
public class WebConfiguration implements WebMvcConfigurer {
    @Override
    public void addFormatters(FormatterRegistry registry) {
        registry.addConverter(new Converter<String, Car>() {
            @Override
            public Car convert(String source) {
                if (!source.isEmpty()){
                    String[] split = source.split(":");
                    Car car = new Car();
                    car.setBrand(split[0]);
                    car.setPrice(Integer.parseInt(split[1]));
                    return car;
                }
                return null;
            }
        });
    }
}
