package com.canyan7n.springbootex.pojo;

import lombok.Data;
import lombok.ToString;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

/**
 * @author ：macheng
 * @version V1.0
 * @ClassName :Car
 * @date ：2023/5/3 20:23
 * @description：TODO
 */
@ConfigurationProperties(prefix = "car")
@EnableConfigurationProperties
@Data
public class Car {
    Integer price;
    String brand;
}
