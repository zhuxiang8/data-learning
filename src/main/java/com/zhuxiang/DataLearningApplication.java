package com.zhuxiang;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@SpringBootApplication
@EnableSwagger2
public class DataLearningApplication {

    public static void main(String[] args) {
        System.out.println("测试分支合并--主");
        SpringApplication.run(DataLearningApplication.class, args);
    }
}
