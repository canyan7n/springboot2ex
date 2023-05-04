package com.canyan7n.springbootex.controller;

import com.canyan7n.springbootex.pojo.Car;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author ：macheng
 * @version V1.0
 * @ClassName :ParameterController
 * @date ：2023/5/4 18:15
 * @description：TODO
 */
@RestController
public class ParameterController {

    @PostMapping("/savecar")
    public Car getCar(Car car){
        return car;
    }
}
