package com.qlearn.springmybatis;

import com.qlearn.springmybatis.model.User;
import org.apache.ibatis.type.MappedTypes;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@MappedTypes(User.class)
@MapperScan("com.qlearn.springmybatis.mapper")
@SpringBootApplication(scanBasePackages={"com.qlearn.springmybatis.controller", "com.qlearn.springmybatis.service"})
public class SpringMybatisApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringMybatisApplication.class, args);
    }

}
