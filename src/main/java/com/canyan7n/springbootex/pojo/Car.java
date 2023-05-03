package com.canyan7n.springbootex.pojo;

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
public class Car {
    String price;
    String brand;

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    @Override
    public String toString() {
        return "Car{" +
                "price='" + price + '\'' +
                ", brand='" + brand + '\'' +
                '}';
    }
}
