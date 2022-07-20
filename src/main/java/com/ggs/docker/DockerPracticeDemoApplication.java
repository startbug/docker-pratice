package com.ggs.docker;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan(basePackages = "com.ggs.docker.mapper")
public class DockerPracticeDemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(DockerPracticeDemoApplication.class, args);
    }

}
