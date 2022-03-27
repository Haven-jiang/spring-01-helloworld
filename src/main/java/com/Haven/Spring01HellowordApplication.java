package com.Haven;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

//@SpringBootApplication: 标注这个类是一个SpringBoot的应用
@SpringBootApplication
//@MapperScan("com.Haven.mapper")
public class Spring01HellowordApplication {

    public static void main(String[] args) {
        SpringApplication.run(Spring01HellowordApplication.class, args);
    }

}
