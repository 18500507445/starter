package com.starter;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

/**
 * api启动程序
 *
 * @author wzh
 */
@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class})
public class StarterApiApplication {

    public static void main(String[] args) {
        SpringApplication.run(StarterApiApplication.class, args);
    }
}