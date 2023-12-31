package com.linchao.linpao;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.linchao.usercenter.mapper")
public class LinPaoApplication {

    public static void main(String[] args) {
        SpringApplication.run(LinPaoApplication.class, args);
    }

}
